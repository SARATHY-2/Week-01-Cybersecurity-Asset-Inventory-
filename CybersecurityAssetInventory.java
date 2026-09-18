import java.util.ArrayList;
import java.util.Scanner;

class Asset {
    int id;
    String name;
    String type;
    String ipAddress;
    String riskLevel;

    Asset(int id, String name, String type, String ipAddress, String riskLevel) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.ipAddress = ipAddress;
        this.riskLevel = riskLevel;
    }

    void display() {
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Type        : " + type);
        System.out.println("IP Address  : " + ipAddress);
        System.out.println("Risk Level  : " + riskLevel);
        System.out.println("-----------------------------");
    }
}

public class CybersecurityAssetInventory {

    static ArrayList<Asset> assets = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Asset
    static void addAsset() {
        System.out.print("Enter Asset ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Asset Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Asset Type (Computer/Server/Router/Switch/Software): ");
        String type = sc.nextLine();

        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        System.out.print("Enter Risk Level (Low/Medium/High): ");
        String risk = sc.nextLine();

        assets.add(new Asset(id, name, type, ip, risk));

        System.out.println("Asset added successfully!");
    }

    // Display Assets
    static void displayAssets() {
        if (assets.isEmpty()) {
            System.out.println("No assets found.");
            return;
        }

        System.out.println("\n===== CYBERSECURITY ASSET INVENTORY =====");

        for (Asset a : assets) {
            a.display();
        }
    }

    // Search Asset
    static void searchAsset() {
        System.out.print("Enter Asset ID to search: ");
        int id = sc.nextInt();

        for (Asset a : assets) {
            if (a.id == id) {
                System.out.println("\nAsset Found:");
                a.display();
                return;
            }
        }

        System.out.println("Asset not found.");
    }

    // Update Asset
    static void updateAsset() {
        System.out.print("Enter Asset ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Asset a : assets) {
            if (a.id == id) {

                System.out.print("Enter new Asset Name: ");
                a.name = sc.nextLine();

                System.out.print("Enter new Asset Type: ");
                a.type = sc.nextLine();

                System.out.print("Enter new IP Address: ");
                a.ipAddress = sc.nextLine();

                System.out.print("Enter new Risk Level (Low/Medium/High): ");
                a.riskLevel = sc.nextLine();

                System.out.println("Asset updated successfully!");
                return;
            }
        }

        System.out.println("Asset not found.");
    }

    // Delete Asset
    static void deleteAsset() {
        System.out.print("Enter Asset ID to delete: ");
        int id = sc.nextInt();

        for (Asset a : assets) {
            if (a.id == id) {
                assets.remove(a);
                System.out.println("Asset deleted successfully!");
                return;
            }
        }

        System.out.println("Asset not found.");
    }

    // Main Menu
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== CYBERSECURITY ASSET INVENTORY SYSTEM =====");
            System.out.println("1. Add Asset");
            System.out.println("2. Display Assets");
            System.out.println("3. Search Asset");
            System.out.println("4. Update Asset");
            System.out.println("5. Delete Asset");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addAsset();
                    break;

                case 2:
                    displayAssets();
                    break;

                case 3:
                    searchAsset();
                    break;

                case 4:
                    updateAsset();
                    break;

                case 5:
                    deleteAsset();
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}

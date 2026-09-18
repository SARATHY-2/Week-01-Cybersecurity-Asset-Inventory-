# Week-01-Cybersecurity-Asset-Inventory-
Cybersecurity Asset Inventory is a centralized record of an organization’s hardware, software, systems, and network assets, used to track, monitor, and manage security risks.
# Cybersecurity Asset Inventory System

## Project Description

The Cybersecurity Asset Inventory System is a Java-based application used to manage and maintain information about an organization's IT assets.

The system allows users to add, search, update, delete, and display asset information. It also provides basic statistics based on asset risk levels and security status.

## Features

- Add new assets
- Search assets using Asset ID
- Update existing asset information
- Delete assets
- Display all assets
- Display asset statistics
- Identify critical and high-risk assets
- Identify vulnerable assets

## Asset Information

The system stores the following details:

- Asset ID
- Asset Name
- Asset Type
- IP Address
- Operating System
- Owner/Department
- Risk Level
- Security Status

## Asset Types

The supported asset types are:

- Workstation
- Server
- Router
- Switch
- Application

## Risk Levels

- Low
- Medium
- High
- Critical

## Security Status

- Secure
- Warning
- Vulnerable

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Scanner

## Main Operations

1. **Add Asset** – Adds a new IT asset to the inventory.
2. **Search Asset** – Searches for an asset using its Asset ID.
3. **Update Asset** – Updates the details of an existing asset.
4. **Delete Asset** – Removes an asset from the inventory.
5. **Display Assets** – Displays all stored assets.
6. **Display Statistics** – Shows total, critical, high-risk, medium-risk, and vulnerable assets.

## How to Run

### Step 1: Compile the program

```bash
javac CybersecurityAssetInventory.java

package HBCmanage;

import javafx.beans.property.*;

public class TableModel_OrderItemsData {
    private final IntegerProperty OrderItems_ID = new SimpleIntegerProperty();
    private final IntegerProperty RepairOrder_ID = new SimpleIntegerProperty();
    private final IntegerProperty Inventory_ID = new SimpleIntegerProperty();
    private final StringProperty Inventory_PartNumber = new SimpleStringProperty();
    private final StringProperty Inventory_Desc = new SimpleStringProperty();
    private final IntegerProperty OrderItems_Qty = new SimpleIntegerProperty();
    private final DoubleProperty OrderItems_Price = new SimpleDoubleProperty();

    public IntegerProperty OrderItemsID() {return OrderItems_ID;}
    public IntegerProperty Repair_IDProperty() {return RepairOrder_ID;}
    public IntegerProperty InventoryIDProperty() {return Inventory_ID;}
    public StringProperty Inventory_PartNumberProperty(){return Inventory_PartNumber;}
    public StringProperty Inventory_Desc_Property(){return Inventory_Desc;}
    public IntegerProperty OrderItems_Qty_Property(){return OrderItems_Qty;}
    public DoubleProperty OrderItems_Price_Property(){return OrderItems_Price;}

    TableModel_OrderItemsData(int OrderID, int RepairID, int InventID, String PartNum, String desc,
                              int qty, double price){
        OrderItems_ID.set(OrderID);
        RepairOrder_ID.set(RepairID);
        Inventory_ID.set(InventID);
        Inventory_PartNumber.set(PartNum);
        Inventory_Desc.set(desc);
        OrderItems_Qty.set(qty);
        OrderItems_Price.set(price);
    }
    public int getOrderItems_ID(){return OrderItems_ID.get();}
    public void setOrderItems_ID(int OrderID){OrderItems_ID.set(OrderID);}

    public int getRepairOrder_ID(){return RepairOrder_ID.get();}
    public void setRepairOrder_ID(int RepairID){RepairOrder_ID.set(RepairID);}

    public int getInventory_ID(){return Inventory_ID.get();}
    public void setInventory_ID(int InventID){Inventory_ID.set(InventID);}

    public String getInventory_PartNumber(){return Inventory_PartNumber.get();}
    public void setInventory_PartNumber(String PartNum){Inventory_PartNumber.set(PartNum);}

    public String getInventory_Desc(){return Inventory_Desc.get();}
    public void setInventory_Desc(String desc){Inventory_Desc.set(desc);}

    public int getOrderItems_Qty(){return OrderItems_Qty.get();}
    public void setOrderItems_Qty(int qty){OrderItems_Qty.set(qty);}

    public double getOrderItems_Price(){return OrderItems_Price.get();}
    public void setOrderItems_Price(double price){OrderItems_Price.set(price);}
}

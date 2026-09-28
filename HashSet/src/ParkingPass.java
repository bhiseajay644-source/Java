import java.util.Objects;

public class ParkingPass {
    private String passId;
    private String vehicleNumber;
    private String vehicleType;
    private String ownerName;

    public ParkingPass(String passId,String vehicleNumber,String vehicleType,String ownerName){
        this.passId=passId;
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.ownerName=ownerName;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Pass ID: " + passId + "\n"
                + "Vehicle Number: " + vehicleNumber + "\n"
                + "Vehicle Type: " + vehicleType + "\n"
                + "Owner Name: " + ownerName + "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingPass)) return false;
        ParkingPass that = (ParkingPass) o;
        return Objects.equals(passId, that.passId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passId);
    }

}

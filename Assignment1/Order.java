public class Order {
    private String id;
    private String userId;
    private String vehicleId;
    private Date startDate;
    private Date endDate;
    private float cost; // Derived from ride duration and pricing
    private OrderStatus status;
    private String location;

    // Getters and Setters
}

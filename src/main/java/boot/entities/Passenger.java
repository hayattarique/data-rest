package boot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "passenger")
@Data
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private Integer passengerId;
    @Column(name = "passenger_nm")
    private String passengerName;
    private String destination;
    private String source;
    @Column(name = "pickup_time")
    private String pickupTime;
    @Column(name = "arrival_time")
    private String arrivalTime;
    private double fare;
}

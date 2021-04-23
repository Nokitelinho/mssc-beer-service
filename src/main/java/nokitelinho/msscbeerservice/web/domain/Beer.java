package nokitelinho.msscbeerservice.web.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Beer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, name = "id", columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;
    @Version
    private Long version;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private Timestamp createDate;
    @UpdateTimestamp
    @Column(name = "last_modified_date")
    private Timestamp lastModifiedDate;
    @Column(name = "beer_name")
    private String beerName;
    @Column(name = "beer_style")
    private String beerStyle;
    @Column(name = "upc")
    private Long upc;
    @Column(name = "price", unique = true)
    private BigDecimal price;

    @Column(name = "min_on_hand")
    private Integer minOnHand;
    @Column(name = "quantity_to_brew")
    private Integer quantityToBrew;
}

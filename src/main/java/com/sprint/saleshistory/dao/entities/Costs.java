package com.sprint.saleshistory.dao.entities;

import java.math.BigDecimal;
import com.sprint.saleshistory.dao.entities.ProductsEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

	@Entity
	@Table(name = "costs")
	public class Costs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	    @ManyToOne
	    @JoinColumn(name = "prod_id", nullable = false)
	    private ProductsEntity product;
	    
	    @ManyToOne
	    @JoinColumn(name="time_id" , nullable = false)
	    private TimesEntity time;
	    
//	    @ManyToOne
//	    @JoinColumn(name="channel_id")
//	    private ChannelsEntity channel;
//	    
//	    
//	    @ManyToOne
//	    @JoinColumn(name="promo_id")
//	    private PromotionsEntity promotion;
//	    

	    @Column(name = "unit_cost", nullable = false)
	    private BigDecimal unitCost;
	    
	    @Column(name = "unit_price", nullable = false)
	    private BigDecimal unitPrice;
	    

	  


	

}

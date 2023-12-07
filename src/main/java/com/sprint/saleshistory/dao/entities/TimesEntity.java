	package com.sprint.saleshistory.dao.entities;
	
	import java.util.Date; 
	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
    import jakarta.persistence.Table;
//	import jakarta.persistence.Table;
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
	@Table(name = "times")
	public class TimesEntity {
		    @Id
		    @Column(name = "time_id")
		    private Date timeId;
	
		    @Column(name = "day_name", nullable = false)
		    private String dayName;
	
		    @Column(name = "day_INT_in_week", nullable = false)
		    private int dayIntInWeek;
	
		    @Column(name = "day_INT_in_month", nullable = false)
		    private int dayIntInMonth;
	
		    @Column(name = "calendar_week_INT", nullable = false)
		    private int calendarWeekInt;
	
		    @Column(name = "fiscal_week_INT", nullable = false)
		    private int fiscalWeekInt;
	
		    @Column(name = "week_ending_day", nullable = false)
		    private Date weekEndingDay;
	
		    @Column(name = "week_ending_day_id", nullable = false)
		    private int weekEndingDayId;
	
		    @Column(name = "calendar_month", nullable = false)
		    private int calendarMonth;
	
		    @Column(name = "fiscal_month_INT", nullable = false)
		    private int fiscalMonthInt;
	
		    @Column(name = "calendar_month_desc", nullable = false)
		    private String calendarMonthDesc;
	
		    @Column(name = "calendar_month_id", nullable = false)
		    private int calendarMonthId;
	
		    @Column(name = "fiscal_month_desc", nullable = false)
		    private String fiscalMonthDesc;
	
		    @Column(name = "fiscal_month_id", nullable = false)
		    private int fiscalMonthId;
	
		    @Column(name = "days_in_cal_month", nullable = false)
		    private int daysInCalMonth;
	
		    @Column(name = "days_in_fs_month", nullable = false)
		    private int daysInFsMonth;
	
		    @Column(name = "end_of_cal_month", nullable = false)
		    private Date endOfCalMonth;
	
		    @Column(name = "end_of_fis_month", nullable = false)
		    private Date endOfFisMonth;
	
		    @Column(name = "calendar_month_name", nullable = false)
		    private String calendarMonthName;
	
		    @Column(name = "fiscal_month_name", nullable = false)
		    private String fiscalMonthName;
	
		    @Column(name = "calendar_quarter_desc", nullable = false)
		    private String calendarQuarterDesc;
	
		    @Column(name = "calendar_quarter_id", nullable = false)
		    private int calendarQuarterId;
	
		    @Column(name = "fiscal_quarter_desc", nullable = false)
		    private String fiscalQuarterDesc;
	
		   @Column(name = "fiscal_quarter_id", nullable = false)
		    private int fiscalQuarterId;
	
		    @Column(name = "days_in_cal_quarter", nullable = false)
		    private int daysInCalQuarter;
	
		    @Column(name = "days_in_fis_quarter", nullable = false)
		    private int daysInFisQuarter;
	
		    @Column(name = "end_of_cal_quarter", nullable = false)
		    private Date endOfCalQuarter;
	
		    @Column(name = "end_of_fis_quarter", nullable = false)
		    private Date endOfFisQuarter;
	
		   @Column(name = "calendar_quarter_INT", nullable = false)
		    private int calendarQuarterInt;
	
		    @Column(name = "fiscal_quarter_INT", nullable = false)
		    private int fiscalQuarterInt;
	
		  
		}
		
	

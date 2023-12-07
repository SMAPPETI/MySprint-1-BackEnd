package com.sprint.saleshistory.models;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TimesPojo {

		@NotNull
	    private Date timeId;
		@NotNull
	    private String dayName;
		@NotNull
		private int dayIntInWeek;
		@NotNull
		private int dayIntInMonth;
		@NotNull
		private int calendarWeekInt;
		@NotNull
		private int fiscalWeekInt;
		@NotNull
		private Date weekEndingDay;
		@NotNull
		private int weekEndingDayId;
		@NotNull
		private int calendarMonthInt;
		@NotNull
		private int fiscalMonthInt;
		@NotNull
		private String calendarMonthDesc;
		@NotNull
		private int calendarMonthId;
	    @NotNull
		private String fiscalMonthDesc;
	    @NotNull
	    private int fiscalMonthId;
	    @NotNull
	    private int daysInCalMonth;
	    @NotNull
	    private int daysInFsMonth;
	    @NotNull
	    private Date endOfCalMonth;
	    @NotNull
	    private Date endOfFisMonth;
	    @NotNull
	    private String calendarMonthName;
	    @NotNull
	    private String fiscalMonthName;
	    @NotNull
	    private String calendarQuarterDesc;
	    @NotNull
	    private int calendarQuarterId;
	    @NotNull
	    private String fiscalQuarterDesc;
	    @NotNull
	    private int fiscalQuarterId;
	    @NotNull
	    private int daysInCalQuarter;
	    @NotNull
	    private int daysInFisQuarter;
	    @NotNull
	    private Date endOfCalQuarter;
	    @NotNull
	    private Date endOfFisQuarter;
	    @NotNull
	    private int calendarQuarterInt;
	    @NotNull
	    private int fiscalQuarterInt;

}  
	


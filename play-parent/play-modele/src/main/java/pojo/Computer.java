package pojo;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Computer {
	
	private Integer id;
	private String name;
	private Calendar introduced;
	private Calendar discontinued;
	private Company company;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getIntroduced() {
		return introduced;
	}
	public String getIntroducedToString() {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(this.introduced.getTime());
	}
	public void setIntroduced(Calendar introduced) {
		this.introduced = introduced;
	}
	public void setIntroduced(Date introduced) {
		if (introduced != null) {
			Calendar cal = dateToCalendar(introduced);
			setIntroduced(cal);
		} else {
			this.introduced = null;
		}
	}
	public Calendar getDiscontinued() {
		return discontinued;
	}
	public String getDiscontinuedToString() {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(this.discontinued.getTime());
	}
	public void setDiscontinued(Calendar discontinued) {
		this.discontinued = discontinued;
	}
	public void setDiscontinued(Date discontinued) {
		if (discontinued != null) {
			Calendar cal = dateToCalendar(discontinued);
			setDiscontinued(cal);
		} else {
			this.discontinued = null;
		}

	}
	private Calendar dateToCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Integer company_id, String name) {
		this.company = new Company(company_id, name);
	}
	public void setCompany(Integer company_id) {
		this.company = new Company(company_id);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Computer(){};
	
	public Computer(Integer id, String name, Calendar introduced,Calendar discontinued, Integer company_id, String name_company) {
		this.id = id;
		this.name = name;
		this.introduced = introduced;
		this.discontinued = discontinued;
		this.company = new Company(company_id, name_company);
	}
	public Computer(String name, Calendar introduced, Calendar discontinued,
			Integer cid) {
		
		this.name = name;
		this.introduced = introduced;
		this.discontinued = discontinued;
		this.company = new Company(cid);	
	}
	public Computer(Integer id, String name, Calendar introduced,
			Calendar discontinued, Integer cid) {
		this.id = id;
		this.name = name;
		this.introduced = introduced;
		this.discontinued = discontinued;
		this.company = new Company(cid);
	}
}

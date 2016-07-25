package spring.model.schedule;
public class SchedulerVO {
	
	private Integer event_id;
	/**플래너 일련번호 */ 
	private String event_name;  
	/**플래너 글제목*/ 
	private String start_date;  
	/**플래너 시작일 */ 
	private String end_date;
	/**플래너 종료일 */ 
	private String ID;
	/**회원 아이디(FK) */ 
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public Integer getEvent_id() {
		return event_id;
	}
	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date2) {
		this.start_date = start_date2;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}  
}
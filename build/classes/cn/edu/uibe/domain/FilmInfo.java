package cn.edu.uibe.domain;
/**
 * ��Ӱ��Ϣ��
 * @author TongQiang
 *
 */
// �洢�ͱ���ͬ�����ݶ���
public class FilmInfo {
	private String id;        //��ӰID
	private String name;      //����
	private String template;  //��ҳģ��
	private String prize;     //����
	private String poster;    //����
	private String director;  //����
	private String country;   //����
	private String summary;   //����
	private String release;   //��ӳ����
	private String score;     //��������
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
}

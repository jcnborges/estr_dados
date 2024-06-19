
public class NoSimples {
	private String info;
	private NoSimples prox;
	public NoSimples(String info) {
		this.info = info;
		this.prox = null;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public NoSimples getProx() {
		return prox;
	}
	public void setProx(NoSimples prox) {
		this.prox = prox;
	}
}

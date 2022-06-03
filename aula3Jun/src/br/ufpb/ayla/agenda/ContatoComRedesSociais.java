package br.ufpb.ayla.agenda;

public class ContatoComRedesSociais extends Contato {

	private String linkedIn;

	private String facebook;
	private String instagram;

	public ContatoComRedesSociais(String nome, String telefone, String email, String linkedIn, String facebook,
			String instagram) {
		super(nome, telefone, email);
		this.linkedIn = linkedIn;
		this.facebook = facebook;
		this.instagram = instagram;
	}

	public ContatoComRedesSociais(String nome, String telefone, String email, String instagram) {
		this(nome, telefone, email, "", "", instagram);
	}
	public ContatoComRedesSociais() {
		this("","","","","","");
	}
	
	@Override
	public String getDadosDeContato() {
		return "Contato com redes sociais:\nNome:" + super.getNome() + "\nTelefone:" + super.getTelefone() + "\nE-mail:"
				+ super.getEmail() + "\nDados de redes sociais:\n" + this.facebook + "\n" + this.instagram + "\n"
				+ this.linkedIn;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

}

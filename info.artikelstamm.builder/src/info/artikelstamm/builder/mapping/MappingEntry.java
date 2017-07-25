package info.artikelstamm.builder.mapping;

public class MappingEntry {
	
	private String gtin;
	private String oddb2xml_prodno;
	private String medindex_prodno;
	
	public MappingEntry(String gtin, String oddb2xml_prodno, String medindex_prodno){
		this.gtin = gtin;
		this.oddb2xml_prodno = oddb2xml_prodno;
		this.medindex_prodno = medindex_prodno;
	}
	
	public String getGtin(){
		return gtin;
	}
	
	public void setGtin(String gtin){
		this.gtin = gtin;
	}
	
	public String getOddb2xml_prodno(){
		return oddb2xml_prodno;
	}
	
	public void setOddb2xml_prodno(String oddb2xml_prodno){
		this.oddb2xml_prodno = oddb2xml_prodno;
	}
	
	public String getMedindex_prodno(){
		return medindex_prodno;
	}
	
	public void setMedindex_prodno(String medindex_prodno){
		this.medindex_prodno = medindex_prodno;
	}
	
	@Override
	public String toString(){
		return gtin + "," + oddb2xml_prodno + "," + medindex_prodno;
	}
}

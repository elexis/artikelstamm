package com.ywesee.oddb2xml.sequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Sequence {
	
	private String prodno;
	private String dscr;
	private String dcsrf;
	private Map<String, SequenceItem> sequenceItems = new HashMap<String, Sequence.SequenceItem>();
	
	public Sequence(String prodno, String dscr, String dscrf){
		this.prodno = prodno;
		this.dscr = dscr;
		this.dcsrf = dscrf;
	}
	
	public String getProdno(){
		return prodno;
	}
	
	public String getDcsrf(){
		return dcsrf;
	}
	
	public String getDscr(){
		return dscr;
	}
	
	public Map<String, SequenceItem> getSequenceItems(){
		return sequenceItems;
	}
	
	public static Function<String, Sequence> mapToSequence = (line) -> {
		Sequence seq = null;
		
		String[] tokens = line.split(";", Integer.MAX_VALUE);
		String prodno = tokens[0];
		tokens = Arrays.copyOfRange(tokens, 1, tokens.length);
		if (tokens.length < 8) {
			System.out.println("ERROR in sequence [" + line + "]");
		}
		List<String[]> sequences = new ArrayList<String[]>();
		boolean error = false;
		for (int i = 0; i < (tokens.length / 8); i++) {
			String[] value = Arrays.copyOfRange(tokens, i * 8, ((i + 1) * 8));
			sequences.add(value);
			if (i == 0) {
				seq = new Sequence(prodno, value[1], "--missing--");
			}

			SequenceItem si = new SequenceItem();
			si.setDesc1(value[0].trim());
			si.setDesc2(value[1].trim());
			si.setGalenicForm(value[2].trim());
			String gtin = value[3].trim();
			if (!gtin.matches("^-?\\d+$")) {
				System.out.println(
					"ERROR is not integer [" + gtin + "] seq [" + i + "] line [" + line + "]");
				error = true;
			}
			si.setGtin(gtin);
			si.setAmount(value[4].trim());
			si.setMunit(value[5].trim());
			si.setPexf(value[6].trim());
			si.setPpub(value[7].trim());
			if (seq != null) {
				seq.getSequenceItems().put(si.getGtin(), si);
			}
		}
		if(error) {
			for (String[] sequence : sequences) {
				System.out.println("\t" + Arrays.toString(sequence));
			}
		}
		
		return seq;
	};
	
	public static class SequenceItem {
		// article name
		String desc1;
		// product name
		String desc2;
		String galenicForm;
		String gtin;
		String amount;
		String munit;
		String pexf;
		String ppub;
		
		public String getDesc1(){
			return desc1;
		}
		
		public void setDesc1(String desc1){
			this.desc1 = desc1;
		}
		
		public String getDesc2(){
			return desc2;
		}
		
		public void setDesc2(String desc2){
			this.desc2 = desc2;
		}
		
		public String getGalenicForm(){
			return galenicForm;
		}
		
		public void setGalenicForm(String galenicForm){
			this.galenicForm = galenicForm;
		}
		
		public String getGtin(){
			return gtin;
		}
		
		public void setGtin(String gtin){
			this.gtin = gtin;
		}
		
		public String getAmount(){
			return amount;
		}
		
		public void setAmount(String amount){
			this.amount = amount;
		}
		
		public String getMunit(){
			return munit;
		}
		
		public void setMunit(String munit){
			this.munit = munit;
		}
		
		public String getPexf(){
			return pexf;
		}
		
		public void setPexf(String pexf){
			this.pexf = pexf;
		}
		
		public String getPpub(){
			return ppub;
		}
		
		public void setPpub(String ppub){
			this.ppub = ppub;
		}
		
	}
	
	@Override
	public String toString(){
		return "Sequence [prodno=" + prodno + ", dscr=" + dscr + ", dcsrf=" + dcsrf
			+ ", sequenceItems=" + sequenceItems + "]";
	}
	
}

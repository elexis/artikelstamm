package com.ywesee.oddb2xml.sequences;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import com.ywesee.oddb2xml.sequences.Sequence.SequenceItem;

public class SequencesValidator {
	public static boolean validateSequencesFile(File oddb2xmlSequencesFileObj) throws IOException{
		List<Sequence> readSequencesFile =
			SequencesHelper.readSequencesFile(oddb2xmlSequencesFileObj);
		boolean containsDoubleProdno = checkForValidAndUniqueProdno(readSequencesFile);
		boolean containsDoubleGTIN = checkForValidAndUniqueGtin(readSequencesFile);
		return (containsDoubleProdno || containsDoubleGTIN);
	}
	
	private static boolean checkForValidAndUniqueGtin(List<Sequence> readSequencesFile){
		Set<String> gtins = new HashSet<>();
		boolean error = false;
		for (Sequence seq : readSequencesFile) {
			Set<Entry<String, SequenceItem>> entrySet = seq.getSequenceItems().entrySet();
			for (Entry<String, SequenceItem> entry : entrySet) {
				SequenceItem value = entry.getValue();
				String gtin = value.gtin;
				if (!gtin.matches("^-?\\d+$")) {
					error = true;
					System.out.println("Numeric GTIN violation [" + gtin + "] in " + seq);
					continue;
				}
				
				if (gtins.contains(value.gtin)) {
					error = true;
					System.out.println("Unique GTIN violation [" + value.gtin + "] in " + seq);
				} else {
					gtins.add(value.gtin);
				}
			}
		}
		return error;
	}
	
	private static boolean checkForValidAndUniqueProdno(List<Sequence> readSequencesFile){
		Set<String> prodnoSet = new HashSet<>();
		Set<String> prodnoDscrSet = new HashSet<>();
		boolean error = false;
		for (Sequence seq : readSequencesFile) {
			String prodno = seq.getProdno();
			if (prodno.length() != 7) {
				error = true;
				System.out.println("PRODNO length 7 violation in " + seq);
			}
			if(prodnoDscrSet.contains(seq.getDscr())) {
				System.out.println("WARNING double PROD_DSCR ["+seq.getProdno()+"] "+seq.getDscr());
			}
			if (prodnoSet.contains(prodno)) {
				error = true;
				System.out.println("Unique PRODNO violation in " + seq);
			} else {
				prodnoSet.add(prodno);
				prodnoDscrSet.add(seq.getDscr());
			}
		}
		return error;
	}
}

package info.artikelstamm.builder.mapping;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import info.artikelstamm.model.v5.DATASOURCEType;

public class Mapping {
	
	private Map<String, MappingEntry> gtinToProducts = new HashMap<>();
	
	public void writeToFile(Path path) throws IOException{
		List<CharSequence> collect = gtinToProducts.entrySet().stream()
			.<CharSequence> map(e -> e.getValue().toString()).collect(Collectors.toList());
		
		collect.add(0, "GTIN,ODDB2XL_PRODNO,MEDINDEX_PRODNO");
		Files.write(path, () -> collect.iterator());
	}
	
	public void add(DATASOURCEType dataSource, String gtin, String prodno, String dscrd){
		MappingEntry mappingEntry = gtinToProducts.get(gtin);
		if (mappingEntry == null) {
			if (DATASOURCEType.MEDINDEX == dataSource) {
				mappingEntry = new MappingEntry(gtin, null, prodno);
			} else if (DATASOURCEType.ODDB_2_XML == dataSource) {
				mappingEntry = new MappingEntry(gtin, prodno, null);
			}
		} else {
			if (DATASOURCEType.MEDINDEX == dataSource) {
				mappingEntry.setMedindex_prodno(prodno);
			} else if (DATASOURCEType.ODDB_2_XML == dataSource) {
				mappingEntry.setOddb2xml_prodno(prodno);
			}
		}
		gtinToProducts.put(gtin, mappingEntry);
	}
	
	public void writeStatistics(PrintStream out){
		int totalGtins = 0;
		int mappable = 0;
		int knownToMedindexOnly = 0;
		int knownToOddb2xmlOnly = 0;
		Collection<MappingEntry> values = gtinToProducts.values();
		for (MappingEntry me : values) {
			totalGtins++;
			if (me.getMedindex_prodno() != null && me.getOddb2xml_prodno() != null) {
				mappable++;
			}
			if (me.getMedindex_prodno() != null && me.getOddb2xml_prodno() == null) {
				knownToMedindexOnly++;
			}
			
			if (me.getMedindex_prodno() == null && me.getOddb2xml_prodno() != null) {
				knownToOddb2xmlOnly++;
			}
		}
		out.println("Total GTINS   "+totalGtins);
		out.println("Mappable      "+mappable);
		out.println("OnlyMedindex  "+knownToMedindexOnly);
		out.println("OnlyOddb2xml  "+knownToOddb2xmlOnly);
		out.println("Non-Mappable  "+(totalGtins-mappable));
	}
	
	//	Files.write(
	//		new File(inputFiles[0].getParentFile(),
	//			DATASOURCEType.ODDB_2_XML.value() + "_gtin_to_prodno.csv").toPath(),
	//		() -> gtinToProdNo.entrySet().stream()
	//			.<CharSequence> map(e -> e.getKey() + "," + e.getValue()).iterator());
	
}

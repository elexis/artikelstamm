/*******************************************************************************
 * Copyright (c) 2013 MEDEVIT.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     MEDEVIT <office@medevit.at> - initial API and implementation
 ******************************************************************************/
package com.ywesee.oddb2xml.sequences;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SequencesHelper {
	
	public static Map<String, Sequence> unmarshallSequences(File oddb2xmlSequencesFileObj)
		throws IOException{
		return readSequencesFile(oddb2xmlSequencesFileObj).stream()
			.collect(Collectors.toMap(Sequence::getProdno, Function.identity()));
	}
	
	public static List<Sequence> readSequencesFile(File oddb2xmlSequencesFileObj)
		throws IOException{
		InputStream is = new FileInputStream(oddb2xmlSequencesFileObj);
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			return br.lines().map(Sequence.mapToSequence).collect(Collectors.toList());
		}
	}
	
}

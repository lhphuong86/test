/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walle.le.test_jaxb;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author lhphuong86
 */
public class WalleXMLPartser<T> {

	public WalleXMLPartser() {
	}

	public String convertToXml(Object source, Class... type) {
		String result;
		StringWriter sw = new StringWriter();
		try {
			JAXBContext carContext = JAXBContext.newInstance(type);
			Marshaller carMarshaller = carContext.createMarshaller();
			carMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			carMarshaller.marshal(source, sw);
			result = sw.toString();
		}
		catch (JAXBException e) {
			throw new RuntimeException(e);
		}

		return result;
	}

	public Object convertToObject(String xml, Class... type) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(type);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(xml);
		Object person = (Object) unmarshaller.unmarshal(reader);
		return person;
	}

}

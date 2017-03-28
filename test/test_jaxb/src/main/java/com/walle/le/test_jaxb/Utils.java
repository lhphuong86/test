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
public class Utils{

	public static <T> String convertToXml(T t) {
		String result;
		StringWriter sw = new StringWriter();
		try {
			JAXBContext carContext = JAXBContext.newInstance(t.getClass());
			Marshaller carMarshaller = carContext.createMarshaller();
			carMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			carMarshaller.marshal(t, sw);
			result = sw.toString();
		}
		catch (JAXBException e) {
			throw new RuntimeException(e);
		}

		return result;
	}

	public static  <T> T convertToObject(String xml, T t) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(t.getClass());
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(xml);
		T person = (T) unmarshaller.unmarshal(reader);
		return person;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Utils.class);
	}
	
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 07:53:38 PM IST 
//

package com.ibm.selmate.jaxb.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * This Complex Type represents an abstraction of all Input Commands to be used
 * for communication with the browser.
 * 
 * 
 * <p>
 * Java class for AbstractElementInteractionCommandType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
&lt;complexType name="AbstractElementInteractionCommandType">
  &lt;complexContent>
    &lt;extension base="{http://www.ibm.com/selmate}AbstractCommandType">
      &lt;sequence>
        &lt;element name="element" type="{http://www.ibm.com/selmate}ElementType"/>
      &lt;/sequence>
    &lt;/extension>
  &lt;/complexContent>
&lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractElementInteractionCommandType", propOrder = { "element" })
@XmlSeeAlso({ WriteTextCommandType.class, AbstractSelectCommandType.class, DragCommandType.class,
		AbstractReadCommandType.class, ClickCommandType.class, DropCommandType.class, WritePasswordCommandType.class,
		ActivateCommandType.class })
public abstract class AbstractElementInteractionCommandType extends AbstractCommandType {

	@XmlElement(required = true)
	protected ElementType element;

	/**
	 * Gets the value of the element property.
	 * 
	 * @return possible object is {@link ElementType }
	 * 
	 */
	public ElementType getElement() {
		return element;
	}

	/**
	 * Sets the value of the element property.
	 * 
	 * @param value allowed object is {@link ElementType }
	 * 
	 */
	public void setElement(ElementType value) {
		this.element = value;
	}

}

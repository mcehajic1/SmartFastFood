/**
 * FridgeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model;

public class FridgeInfo  implements java.io.Serializable {
    private int fridgeInfoId;

    private java.lang.String temperature;

    private java.lang.String workingTime;

    public FridgeInfo() {
    }

    public FridgeInfo(
           int fridgeInfoId,
           java.lang.String temperature,
           java.lang.String workingTime) {
           this.fridgeInfoId = fridgeInfoId;
           this.temperature = temperature;
           this.workingTime = workingTime;
    }


    /**
     * Gets the fridgeInfoId value for this FridgeInfo.
     * 
     * @return fridgeInfoId
     */
    public int getFridgeInfoId() {
        return fridgeInfoId;
    }


    /**
     * Sets the fridgeInfoId value for this FridgeInfo.
     * 
     * @param fridgeInfoId
     */
    public void setFridgeInfoId(int fridgeInfoId) {
        this.fridgeInfoId = fridgeInfoId;
    }


    /**
     * Gets the temperature value for this FridgeInfo.
     * 
     * @return temperature
     */
    public java.lang.String getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this FridgeInfo.
     * 
     * @param temperature
     */
    public void setTemperature(java.lang.String temperature) {
        this.temperature = temperature;
    }


    /**
     * Gets the workingTime value for this FridgeInfo.
     * 
     * @return workingTime
     */
    public java.lang.String getWorkingTime() {
        return workingTime;
    }


    /**
     * Sets the workingTime value for this FridgeInfo.
     * 
     * @param workingTime
     */
    public void setWorkingTime(java.lang.String workingTime) {
        this.workingTime = workingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FridgeInfo)) return false;
        FridgeInfo other = (FridgeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fridgeInfoId == other.getFridgeInfoId() &&
            ((this.temperature==null && other.getTemperature()==null) || 
             (this.temperature!=null &&
              this.temperature.equals(other.getTemperature()))) &&
            ((this.workingTime==null && other.getWorkingTime()==null) || 
             (this.workingTime!=null &&
              this.workingTime.equals(other.getWorkingTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getFridgeInfoId();
        if (getTemperature() != null) {
            _hashCode += getTemperature().hashCode();
        }
        if (getWorkingTime() != null) {
            _hashCode += getWorkingTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FridgeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model", "FridgeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridgeInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "fridgeInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "temperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "workingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

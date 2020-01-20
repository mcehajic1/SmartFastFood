/**
 * RefrigeratorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model;

public class RefrigeratorInfo  implements java.io.Serializable {
    private int refrigeratorId;

    private java.lang.String temperature;

    private java.lang.String workingTime;

    public RefrigeratorInfo() {
    }

    public RefrigeratorInfo(
           int refrigeratorId,
           java.lang.String temperature,
           java.lang.String workingTime) {
           this.refrigeratorId = refrigeratorId;
           this.temperature = temperature;
           this.workingTime = workingTime;
    }


    /**
     * Gets the refrigeratorId value for this RefrigeratorInfo.
     * 
     * @return refrigeratorId
     */
    public int getRefrigeratorId() {
        return refrigeratorId;
    }


    /**
     * Sets the refrigeratorId value for this RefrigeratorInfo.
     * 
     * @param refrigeratorId
     */
    public void setRefrigeratorId(int refrigeratorId) {
        this.refrigeratorId = refrigeratorId;
    }


    /**
     * Gets the temperature value for this RefrigeratorInfo.
     * 
     * @return temperature
     */
    public java.lang.String getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this RefrigeratorInfo.
     * 
     * @param temperature
     */
    public void setTemperature(java.lang.String temperature) {
        this.temperature = temperature;
    }


    /**
     * Gets the workingTime value for this RefrigeratorInfo.
     * 
     * @return workingTime
     */
    public java.lang.String getWorkingTime() {
        return workingTime;
    }


    /**
     * Sets the workingTime value for this RefrigeratorInfo.
     * 
     * @param workingTime
     */
    public void setWorkingTime(java.lang.String workingTime) {
        this.workingTime = workingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefrigeratorInfo)) return false;
        RefrigeratorInfo other = (RefrigeratorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.refrigeratorId == other.getRefrigeratorId() &&
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
        _hashCode += getRefrigeratorId();
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
        new org.apache.axis.description.TypeDesc(RefrigeratorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model", "RefrigeratorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refrigeratorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "refrigeratorId"));
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

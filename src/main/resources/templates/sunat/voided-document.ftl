<?xml version="1.0" encoding="ISO-8859-1"?>
<VoidedDocuments xmlns="urn:sunat:names:specification:ubl:peru:schema:xsd:VoidedDocuments-1"
                 xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2"
                 xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2"
                 xmlns:ds="http://www.w3.org/2000/09/xmldsig#"
                 xmlns:ext="urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2"
                 xmlns:sac="urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <ext:UBLExtensions>
        <ext:UBLExtension>
            <ext:ExtensionContent />
        </ext:UBLExtension>
    </ext:UBLExtensions>
    <cbc:UBLVersionID>2.0</cbc:UBLVersionID>
    <cbc:CustomizationID>1.0</cbc:CustomizationID>
    <cbc:ID>${serieNumero}</cbc:ID>
    <cbc:ReferenceDate>${fechaEmisionDocumentReference}</cbc:ReferenceDate>
    <cbc:IssueDate>${fechaEmision}</cbc:IssueDate>
    <#include "../signature.ftl">
    <cac:AccountingSupplierParty>
        <cbc:CustomerAssignedAccountID>${proveedor.ruc}</cbc:CustomerAssignedAccountID>
        <cbc:AdditionalAccountID>6</cbc:AdditionalAccountID>
        <cac:Party>
            <#if proveedor.nombreComercial??>
            <cac:PartyName>
                <cbc:Name>${proveedor.nombreComercial}</cbc:Name>
            </cac:PartyName>
            </#if>
            <cac:PostalAddress>
                <cbc:ID>${proveedor.codigoPostal}</cbc:ID>
            </cac:PostalAddress>
            <cac:PartyLegalEntity>
                <cbc:RegistrationName>${proveedor.razonSocial}</cbc:RegistrationName>
            </cac:PartyLegalEntity>
        </cac:Party>
    </cac:AccountingSupplierParty>
    <sac:VoidedDocumentsLine>
        <cbc:LineID>1</cbc:LineID>
        <cbc:DocumentTypeCode>${tipoDocumentReference.code}</cbc:DocumentTypeCode>
        <sac:DocumentSerialID>${serieDocumentReference}</sac:DocumentSerialID>
        <sac:DocumentNumberID>${numeroDocumentReference}</sac:DocumentNumberID>
        <sac:VoidReasonDescription>${motivoBajaDocumentReference}</sac:VoidReasonDescription>
    </sac:VoidedDocumentsLine>
</VoidedDocuments>
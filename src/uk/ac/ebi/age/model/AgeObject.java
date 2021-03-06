package uk.ac.ebi.age.model;

import java.util.Collection;

/**
 @model
*/

public interface AgeObject extends AgeAbstractObject
{
 /** @model */
 String getId();
 String getOriginalId();

 AgeClass getAgeElClass();
 
 Collection<? extends AgeRelation> getRelations();

// Collection<String> getRelationClassesIds();
 Collection< ? extends AgeRelationClass> getRelationClasses();

// Collection< ? extends AgeRelation> getRelationsByClassId(String cid);
 Collection< ? extends AgeRelation> getRelationsByClass(AgeRelationClass cls, boolean wSubCls);

 
 
 Object getAttributeValue( AgeAttributeClass cls );
 
 int getOrder();

 Submission getSubmission();

}

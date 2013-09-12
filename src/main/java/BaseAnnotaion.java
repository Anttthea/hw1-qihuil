

/* First created by JCasGen Wed Sep 11 19:58:55 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 20:01:46 EDT 2013
 * XML source: /home/lenovo/git/hw1-qihuil/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class BaseAnnotaion extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotaion.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BaseAnnotaion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotaion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotaion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotaion(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated */
  public String getSource() {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "BaseAnnotaion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "BaseAnnotaion");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BaseAnnotaion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BaseAnnotaion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_confidence, v);}    
  }

    
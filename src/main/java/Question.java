

/* First created by JCasGen Tue Sep 10 15:59:25 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 20:01:46 EDT 2013
 * XML source: /home/lenovo/git/hw1-qihuil/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: QuesBaseAnno

  /** getter for QuesBaseAnno - gets 
   * @generated */
  public BaseAnnotaion getQuesBaseAnno() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuesBaseAnno == null)
      jcasType.jcas.throwFeatMissing("QuesBaseAnno", "Question");
    return (BaseAnnotaion)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_QuesBaseAnno)));}
    
  /** setter for QuesBaseAnno - sets  
   * @generated */
  public void setQuesBaseAnno(BaseAnnotaion v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuesBaseAnno == null)
      jcasType.jcas.throwFeatMissing("QuesBaseAnno", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_QuesBaseAnno, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
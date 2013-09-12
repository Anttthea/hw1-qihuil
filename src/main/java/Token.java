

/* First created by JCasGen Tue Sep 10 11:03:43 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 20:01:46 EDT 2013
 * XML source: /home/lenovo/git/hw1-qihuil/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: TokenBaseAnno

  /** getter for TokenBaseAnno - gets 
   * @generated */
  public BaseAnnotaion getTokenBaseAnno() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenBaseAnno == null)
      jcasType.jcas.throwFeatMissing("TokenBaseAnno", "Token");
    return (BaseAnnotaion)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_TokenBaseAnno)));}
    
  /** setter for TokenBaseAnno - sets  
   * @generated */
  public void setTokenBaseAnno(BaseAnnotaion v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenBaseAnno == null)
      jcasType.jcas.throwFeatMissing("TokenBaseAnno", "Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_TokenBaseAnno, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
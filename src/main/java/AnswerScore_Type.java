
/* First created by JCasGen Tue Sep 10 17:16:20 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 11 20:01:46 EDT 2013
 * @generated */
public class AnswerScore_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerScore_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerScore_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerScore(addr, AnswerScore_Type.this);
  			   AnswerScore_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerScore(addr, AnswerScore_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerScore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerScore");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "AnswerScore");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "AnswerScore");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answer;
  /** @generated */
  final int     casFeatCode_answer;
  /** @generated */ 
  public int getAnswer(int addr) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "AnswerScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answer);
  }
  /** @generated */    
  public void setAnswer(int addr, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "AnswerScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_answer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerBaseAnno;
  /** @generated */
  final int     casFeatCode_AnswerBaseAnno;
  /** @generated */ 
  public int getAnswerBaseAnno(int addr) {
        if (featOkTst && casFeat_AnswerBaseAnno == null)
      jcas.throwFeatMissing("AnswerBaseAnno", "AnswerScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerBaseAnno);
  }
  /** @generated */    
  public void setAnswerBaseAnno(int addr, int v) {
        if (featOkTst && casFeat_AnswerBaseAnno == null)
      jcas.throwFeatMissing("AnswerBaseAnno", "AnswerScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerBaseAnno, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_answer = jcas.getRequiredFeatureDE(casType, "answer", "Answer", featOkTst);
    casFeatCode_answer  = (null == casFeat_answer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answer).getCode();

 
    casFeat_AnswerBaseAnno = jcas.getRequiredFeatureDE(casType, "AnswerBaseAnno", "BaseAnnotaion", featOkTst);
    casFeatCode_AnswerBaseAnno  = (null == casFeat_AnswerBaseAnno) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerBaseAnno).getCode();

  }
}



    
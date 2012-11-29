package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.PomData;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class JemmyPomData extends PomData {
  private final String _testSuiteBundle;
  
  public String getTestSuiteBundle() {
    return this._testSuiteBundle;
  }
  
  private final String _testSuiteClass;
  
  public String getTestSuiteClass() {
    return this._testSuiteClass;
  }
  
  private final String _testProductId;
  
  public String getTestProductId() {
    return this._testProductId;
  }
  
  private final String _applicationFeature;
  
  public String getApplicationFeature() {
    return this._applicationFeature;
  }
  
  public JemmyPomData(final String description, final String groupId, final String artifactId, final String parentGroupId, final String parentArtifactId, final String parentVersion, final String parentPomPath, final String testSuiteBundle, final String testSuiteClass, final String testProductId, final String applicationFeature) {
    super(description, groupId, artifactId, parentGroupId, parentArtifactId, parentVersion, parentPomPath);
    this._testSuiteBundle = testSuiteBundle;
    this._testSuiteClass = testSuiteClass;
    this._testProductId = testProductId;
    this._applicationFeature = applicationFeature;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((_testSuiteBundle== null) ? 0 : _testSuiteBundle.hashCode());
    result = prime * result + ((_testSuiteClass== null) ? 0 : _testSuiteClass.hashCode());
    result = prime * result + ((_testProductId== null) ? 0 : _testProductId.hashCode());
    result = prime * result + ((_applicationFeature== null) ? 0 : _applicationFeature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (!super.equals(obj))
      return false;
    JemmyPomData other = (JemmyPomData) obj;
    if (_testSuiteBundle == null) {
      if (other._testSuiteBundle != null)
        return false;
    } else if (!_testSuiteBundle.equals(other._testSuiteBundle))
      return false;
    if (_testSuiteClass == null) {
      if (other._testSuiteClass != null)
        return false;
    } else if (!_testSuiteClass.equals(other._testSuiteClass))
      return false;
    if (_testProductId == null) {
      if (other._testProductId != null)
        return false;
    } else if (!_testProductId.equals(other._testProductId))
      return false;
    if (_applicationFeature == null) {
      if (other._applicationFeature != null)
        return false;
    } else if (!_applicationFeature.equals(other._applicationFeature))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

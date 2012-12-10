package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class PomData {
  private final String _description;
  
  public String getDescription() {
    return this._description;
  }
  
  private final String _groupId;
  
  public String getGroupId() {
    return this._groupId;
  }
  
  private final String _artifactId;
  
  public String getArtifactId() {
    return this._artifactId;
  }
  
  private final String _parentGroupId;
  
  public String getParentGroupId() {
    return this._parentGroupId;
  }
  
  private final String _parentArtifactId;
  
  public String getParentArtifactId() {
    return this._parentArtifactId;
  }
  
  private final String _parentVersion;
  
  public String getParentVersion() {
    return this._parentVersion;
  }
  
  private final String _parentPomPath;
  
  public String getParentPomPath() {
    return this._parentPomPath;
  }
  
  public PomData(final String description, final String groupId, final String artifactId, final String parentGroupId, final String parentArtifactId, final String parentVersion, final String parentPomPath) {
    super();
    this._description = description;
    this._groupId = groupId;
    this._artifactId = artifactId;
    this._parentGroupId = parentGroupId;
    this._parentArtifactId = parentArtifactId;
    this._parentVersion = parentVersion;
    this._parentPomPath = parentPomPath;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_description== null) ? 0 : _description.hashCode());
    result = prime * result + ((_groupId== null) ? 0 : _groupId.hashCode());
    result = prime * result + ((_artifactId== null) ? 0 : _artifactId.hashCode());
    result = prime * result + ((_parentGroupId== null) ? 0 : _parentGroupId.hashCode());
    result = prime * result + ((_parentArtifactId== null) ? 0 : _parentArtifactId.hashCode());
    result = prime * result + ((_parentVersion== null) ? 0 : _parentVersion.hashCode());
    result = prime * result + ((_parentPomPath== null) ? 0 : _parentPomPath.hashCode());
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
    PomData other = (PomData) obj;
    if (_description == null) {
      if (other._description != null)
        return false;
    } else if (!_description.equals(other._description))
      return false;
    if (_groupId == null) {
      if (other._groupId != null)
        return false;
    } else if (!_groupId.equals(other._groupId))
      return false;
    if (_artifactId == null) {
      if (other._artifactId != null)
        return false;
    } else if (!_artifactId.equals(other._artifactId))
      return false;
    if (_parentGroupId == null) {
      if (other._parentGroupId != null)
        return false;
    } else if (!_parentGroupId.equals(other._parentGroupId))
      return false;
    if (_parentArtifactId == null) {
      if (other._parentArtifactId != null)
        return false;
    } else if (!_parentArtifactId.equals(other._parentArtifactId))
      return false;
    if (_parentVersion == null) {
      if (other._parentVersion != null)
        return false;
    } else if (!_parentVersion.equals(other._parentVersion))
      return false;
    if (_parentPomPath == null) {
      if (other._parentPomPath != null)
        return false;
    } else if (!_parentPomPath.equals(other._parentPomPath))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.PomData;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.Repository;
import java.util.List;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class RootPomData extends PomData {
  private final String _version;
  
  public String getVersion() {
    return this._version;
  }
  
  private final String _tychoVersion;
  
  public String getTychoVersion() {
    return this._tychoVersion;
  }
  
  private final String _junitVersion;
  
  public String getJunitVersion() {
    return this._junitVersion;
  }
  
  private final String _mockitoVersion;
  
  public String getMockitoVersion() {
    return this._mockitoVersion;
  }
  
  private final String _platformVersion;
  
  public String getPlatformVersion() {
    return this._platformVersion;
  }
  
  private final String _efxVersion;
  
  public String getEfxVersion() {
    return this._efxVersion;
  }
  
  private final boolean _envLinux32 = true;
  
  public boolean isEnvLinux32() {
    return this._envLinux32;
  }
  
  private final boolean _envLinux64 = true;
  
  public boolean isEnvLinux64() {
    return this._envLinux64;
  }
  
  private final boolean _envWin32 = true;
  
  public boolean isEnvWin32() {
    return this._envWin32;
  }
  
  private final boolean _envWin64 = true;
  
  public boolean isEnvWin64() {
    return this._envWin64;
  }
  
  private final boolean _envMacOS = true;
  
  public boolean isEnvMacOS() {
    return this._envMacOS;
  }
  
  private final String _javaFXArtifactVersion;
  
  public String getJavaFXArtifactVersion() {
    return this._javaFXArtifactVersion;
  }
  
  private final List<String> _modulePaths;
  
  public List<String> getModulePaths() {
    return this._modulePaths;
  }
  
  private final List<Repository> _repositories;
  
  public List<Repository> getRepositories() {
    return this._repositories;
  }
  
  public RootPomData(final String description, final String groupId, final String artifactId, final String parentGroupId, final String parentArtifactId, final String parentVersion, final String parentPomPath, final String version, final String tychoVersion, final String junitVersion, final String mockitoVersion, final String platformVersion, final String efxVersion, final String javaFXArtifactVersion, final List<String> modulePaths, final List<Repository> repositories) {
    super(description, groupId, artifactId, parentGroupId, parentArtifactId, parentVersion, parentPomPath);
    this._version = version;
    this._tychoVersion = tychoVersion;
    this._junitVersion = junitVersion;
    this._mockitoVersion = mockitoVersion;
    this._platformVersion = platformVersion;
    this._efxVersion = efxVersion;
    this._javaFXArtifactVersion = javaFXArtifactVersion;
    this._modulePaths = modulePaths;
    this._repositories = repositories;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((_version== null) ? 0 : _version.hashCode());
    result = prime * result + ((_tychoVersion== null) ? 0 : _tychoVersion.hashCode());
    result = prime * result + ((_junitVersion== null) ? 0 : _junitVersion.hashCode());
    result = prime * result + ((_mockitoVersion== null) ? 0 : _mockitoVersion.hashCode());
    result = prime * result + ((_platformVersion== null) ? 0 : _platformVersion.hashCode());
    result = prime * result + ((_efxVersion== null) ? 0 : _efxVersion.hashCode());
    result = prime * result + (_envLinux32 ? 1231 : 1237);
    result = prime * result + (_envLinux64 ? 1231 : 1237);
    result = prime * result + (_envWin32 ? 1231 : 1237);
    result = prime * result + (_envWin64 ? 1231 : 1237);
    result = prime * result + (_envMacOS ? 1231 : 1237);
    result = prime * result + ((_javaFXArtifactVersion== null) ? 0 : _javaFXArtifactVersion.hashCode());
    result = prime * result + ((_modulePaths== null) ? 0 : _modulePaths.hashCode());
    result = prime * result + ((_repositories== null) ? 0 : _repositories.hashCode());
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
    RootPomData other = (RootPomData) obj;
    if (_version == null) {
      if (other._version != null)
        return false;
    } else if (!_version.equals(other._version))
      return false;
    if (_tychoVersion == null) {
      if (other._tychoVersion != null)
        return false;
    } else if (!_tychoVersion.equals(other._tychoVersion))
      return false;
    if (_junitVersion == null) {
      if (other._junitVersion != null)
        return false;
    } else if (!_junitVersion.equals(other._junitVersion))
      return false;
    if (_mockitoVersion == null) {
      if (other._mockitoVersion != null)
        return false;
    } else if (!_mockitoVersion.equals(other._mockitoVersion))
      return false;
    if (_platformVersion == null) {
      if (other._platformVersion != null)
        return false;
    } else if (!_platformVersion.equals(other._platformVersion))
      return false;
    if (_efxVersion == null) {
      if (other._efxVersion != null)
        return false;
    } else if (!_efxVersion.equals(other._efxVersion))
      return false;
    if (other._envLinux32 != _envLinux32)
      return false;
    if (other._envLinux64 != _envLinux64)
      return false;
    if (other._envWin32 != _envWin32)
      return false;
    if (other._envWin64 != _envWin64)
      return false;
    if (other._envMacOS != _envMacOS)
      return false;
    if (_javaFXArtifactVersion == null) {
      if (other._javaFXArtifactVersion != null)
        return false;
    } else if (!_javaFXArtifactVersion.equals(other._javaFXArtifactVersion))
      return false;
    if (_modulePaths == null) {
      if (other._modulePaths != null)
        return false;
    } else if (!_modulePaths.equals(other._modulePaths))
      return false;
    if (_repositories == null) {
      if (other._repositories != null)
        return false;
    } else if (!_repositories.equals(other._repositories))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

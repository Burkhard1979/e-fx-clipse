package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Repository {
  private final String _id;
  
  public String getId() {
    return this._id;
  }
  
  private final String _url;
  
  public String getUrl() {
    return this._url;
  }
  
  public Repository(final String id, final String url) {
    super();
    this._id = id;
    this._url = url;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_id== null) ? 0 : _id.hashCode());
    result = prime * result + ((_url== null) ? 0 : _url.hashCode());
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
    Repository other = (Repository) obj;
    if (_id == null) {
      if (other._id != null)
        return false;
    } else if (!_id.equals(other._id))
      return false;
    if (_url == null) {
      if (other._url != null)
        return false;
    } else if (!_url.equals(other._url))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

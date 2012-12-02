package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class NativeLaunchData {
  private final String _tychoOutDir;
  
  public String getTychoOutDir() {
    return this._tychoOutDir;
  }
  
  private final String _productName;
  
  public String getProductName() {
    return this._productName;
  }
  
  private final String _vendorName;
  
  public String getVendorName() {
    return this._vendorName;
  }
  
  public NativeLaunchData(final String tychoOutDir, final String productName, final String vendorName) {
    super();
    this._tychoOutDir = tychoOutDir;
    this._productName = productName;
    this._vendorName = vendorName;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_tychoOutDir== null) ? 0 : _tychoOutDir.hashCode());
    result = prime * result + ((_productName== null) ? 0 : _productName.hashCode());
    result = prime * result + ((_vendorName== null) ? 0 : _vendorName.hashCode());
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
    NativeLaunchData other = (NativeLaunchData) obj;
    if (_tychoOutDir == null) {
      if (other._tychoOutDir != null)
        return false;
    } else if (!_tychoOutDir.equals(other._tychoOutDir))
      return false;
    if (_productName == null) {
      if (other._productName != null)
        return false;
    } else if (!_productName.equals(other._productName))
      return false;
    if (_vendorName == null) {
      if (other._vendorName != null)
        return false;
    } else if (!_vendorName.equals(other._vendorName))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

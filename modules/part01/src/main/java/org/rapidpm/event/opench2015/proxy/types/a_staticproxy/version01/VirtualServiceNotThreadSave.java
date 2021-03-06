package org.rapidpm.event.opench2015.proxy.types.a_staticproxy.version01;

import org.rapidpm.event.opench2015.proxy.model.Service;
import org.rapidpm.event.opench2015.proxy.model.ServiceImpl;

/**
 * Created by Sven Ruppert on 15.09.2014.
 */
public class VirtualServiceNotThreadSave implements Service {

  private Service service = null;

  @Override
  public String work(String txt) {
    if(service == null){
      service = new ServiceImpl();
    }
    return service.work(txt);
  }
}

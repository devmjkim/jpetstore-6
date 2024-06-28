package org.mybatis.jpetstore.web.actions;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.SessionScope;

@SessionScope
public class SleepActionBean extends AbstractActionBean {

  private static final long serialVersionUID = 5849523372175050635L;

  private static final String VIEW = "/WEB-INF/jsp/sleep/Sleep.jsp";

  @DefaultHandler
  public ForwardResolution viewSleep() {
    return new ForwardResolution(VIEW);
  }

}

package br.uva.algoritmoGenetico;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.uva.algoritmoGenetico.util.Util;

@Resource
public class IndexController {

    private final Result result;
    private Util util;

    public IndexController(Result result, Util util) {
        this.result = result;
        this.util = util;
    }

    @Path("/")
    public void index() {
        result.include("", "VRaptor 3.5");
    }

}

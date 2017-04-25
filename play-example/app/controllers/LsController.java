package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

// Add the following to conf/routes 
/*
GET     /ls        controllers.LsController.lsGet
POST    /ls        controllers.LsController.lsPost
*/

/**
 * Ls form controller for Play Java
 */
public class LsController extends Controller {

    private final Form<LsData> lsForm;

    @Inject
    public LsController(FormFactory formFactory) {
        this.lsForm = formFactory.form(LsData.class);
    }

    public Result lsGet() {
        return ok(views.html.ls.form.render(lsForm));
    }

    public Result lsPost() {
        Form<LsData> boundForm = lsForm.bindFromRequest();
        if (boundForm.hasErrors()) {
            return badRequest(views.html.ls.form.render(boundForm));
        } else {
            LsData ls = boundForm.get();
            flash("success", "Ls " + ls);
            return redirect(routes.LsController.lsGet());
        }
    }

}

package pl.project.fieldgame;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorControllerImpl implements ErrorController {

    @RequestMapping("/error;")
    public ErrorInfo handleError(HttpServletRequest request) {
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        return new ErrorInfo(exception, request.getRequestURI());
    }

    @Override
    public String getErrorPath() {
        return "/error;";
    }
}

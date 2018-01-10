package org.springframework.samples.petclinic.validation;

import org.springframework.samples.petclinic.Owner;
import org.springframework.validation.Errors;

public class MyValidator {
 // test build trigger
 // test build trigger once again

  public void validate(Owner owner, Errors errors) {
    String name = owner.getFirstName();
    if (name != null && !name.equals("Anton")) {
      errors.rejectValue("firstName", null, "only Anton is allowed!");
    }
  }

}

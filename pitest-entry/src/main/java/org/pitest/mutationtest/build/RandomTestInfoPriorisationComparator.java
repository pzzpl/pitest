/*
 * Copyright 2011 Henry Coles
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package org.pitest.mutationtest.build;

import java.io.Serializable;
import java.util.Comparator;

import org.pitest.classinfo.ClassName;
import org.pitest.coverage.TestInfo;

public class RandomTestInfoPriorisationComparator implements Comparator<TestInfo>,
Serializable {

  private static final long serialVersionUID = 1L;

  private final int         distanceTimeWeighting;
  private final ClassName   targetClass;

  public RandomTestInfoPriorisationComparator(final ClassName targetClass,
      final int distanceTimeWeighting) {
    this.targetClass = targetClass;
    this.distanceTimeWeighting = distanceTimeWeighting;
  }

  @Override
  public int compare(final TestInfo arg0, final TestInfo arg1) {
    return arg0.ran - arg1.ran;
  }

 

}

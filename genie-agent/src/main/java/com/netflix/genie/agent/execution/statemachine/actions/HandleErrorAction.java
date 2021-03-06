/*
 *
 *  Copyright 2018 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.netflix.genie.agent.execution.statemachine.actions;

import com.netflix.genie.agent.execution.statemachine.Events;
import com.netflix.genie.agent.execution.statemachine.States;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.statemachine.StateContext;
import org.springframework.stereotype.Component;

/**
 * Action performed when in state HANDLE_ERROR.
 * @author mprimi
 * @since 4.0.0
 */
@Component
@Lazy
@Slf4j
class HandleErrorAction extends BaseStateAction implements StateAction.HandleError {

    /**
     * {@inheritDoc}
     */
    @Override
    protected Events executeStateAction(final StateContext<States, Events> context) {
        log.info("Error...");
        //TODO implement this action
        return Events.HANDLE_ERROR_COMPLETE;
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicebus.v2017_04_01.DisasterRecoveryConfigs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.servicebus.v2017_04_01.CheckNameAvailabilityResult;
import com.microsoft.azure.management.servicebus.v2017_04_01.ArmDisasterRecovery;
import com.microsoft.azure.management.servicebus.v2017_04_01.DisasterRecoveryConfigNamespaceSBAuthorizationRule;
import com.microsoft.azure.management.servicebus.v2017_04_01.AccessKeys;

class DisasterRecoveryConfigsImpl extends WrapperImpl<DisasterRecoveryConfigsInner> implements DisasterRecoveryConfigs {
    private final ServiceBusManager manager;

    DisasterRecoveryConfigsImpl(ServiceBusManager manager) {
        super(manager.inner().disasterRecoveryConfigs());
        this.manager = manager;
    }

    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public ArmDisasterRecoveryImpl define(String name) {
        return wrapModel(name);
    }

    private ArmDisasterRecoveryImpl wrapModel(ArmDisasterRecoveryInner inner) {
        return  new ArmDisasterRecoveryImpl(inner, manager());
    }

    private ArmDisasterRecoveryImpl wrapModel(String name) {
        return new ArmDisasterRecoveryImpl(name, this.manager());
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityMethodAsync(String resourceGroupName, String namespaceName, String name) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.checkNameAvailabilityMethodAsync(resourceGroupName, namespaceName, name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable breakPairingAsync(String resourceGroupName, String namespaceName, String alias) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.breakPairingAsync(resourceGroupName, namespaceName, alias).toCompletable();
    }

    @Override
    public Completable failOverAsync(String resourceGroupName, String namespaceName, String alias) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.failOverAsync(resourceGroupName, namespaceName, alias).toCompletable();
    }

    @Override
    public Observable<ArmDisasterRecovery> listAsync(final String resourceGroupName, final String namespaceName) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.listAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<ArmDisasterRecoveryInner>, Iterable<ArmDisasterRecoveryInner>>() {
            @Override
            public Iterable<ArmDisasterRecoveryInner> call(Page<ArmDisasterRecoveryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ArmDisasterRecoveryInner, ArmDisasterRecovery>() {
            @Override
            public ArmDisasterRecovery call(ArmDisasterRecoveryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ArmDisasterRecovery> getAsync(String resourceGroupName, String namespaceName, String alias) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, alias)
        .map(new Func1<ArmDisasterRecoveryInner, ArmDisasterRecovery>() {
            @Override
            public ArmDisasterRecovery call(ArmDisasterRecoveryInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String alias) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, alias).toCompletable();
    }

    private DisasterRecoveryConfigNamespaceSBAuthorizationRuleImpl wrapDisasterRecoveryConfigNamespaceSBAuthorizationRuleModel(SBAuthorizationRuleInner inner) {
        return  new DisasterRecoveryConfigNamespaceSBAuthorizationRuleImpl(inner, manager());
    }

    private Observable<SBAuthorizationRuleInner> getSBAuthorizationRuleInnerUsingDisasterRecoveryConfigsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String alias = IdParsingUtils.getValueFromIdByName(id, "disasterRecoveryConfigs");
        String authorizationRuleName = IdParsingUtils.getValueFromIdByName(id, "AuthorizationRules");
        DisasterRecoveryConfigsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, alias, authorizationRuleName);
    }

    @Override
    public Observable<DisasterRecoveryConfigNamespaceSBAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String alias, String authorizationRuleName) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, alias, authorizationRuleName)
        .map(new Func1<SBAuthorizationRuleInner, DisasterRecoveryConfigNamespaceSBAuthorizationRule>() {
            @Override
            public DisasterRecoveryConfigNamespaceSBAuthorizationRule call(SBAuthorizationRuleInner inner) {
                return wrapDisasterRecoveryConfigNamespaceSBAuthorizationRuleModel(inner);
            }
       });
    }

    @Override
    public Observable<DisasterRecoveryConfigNamespaceSBAuthorizationRule> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String alias) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.listAuthorizationRulesAsync(resourceGroupName, namespaceName, alias)
        .flatMapIterable(new Func1<Page<SBAuthorizationRuleInner>, Iterable<SBAuthorizationRuleInner>>() {
            @Override
            public Iterable<SBAuthorizationRuleInner> call(Page<SBAuthorizationRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SBAuthorizationRuleInner, DisasterRecoveryConfigNamespaceSBAuthorizationRule>() {
            @Override
            public DisasterRecoveryConfigNamespaceSBAuthorizationRule call(SBAuthorizationRuleInner inner) {
                return wrapDisasterRecoveryConfigNamespaceSBAuthorizationRuleModel(inner);
            }
        });
    }

    @Override
    public Observable<AccessKeys> listKeysAsync(String resourceGroupName, String namespaceName, String alias, String authorizationRuleName) {
        DisasterRecoveryConfigsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, namespaceName, alias, authorizationRuleName)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

}

/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.organization.management.organization.user.sharing.internal;

import org.wso2.carbon.identity.organization.management.organization.user.sharing.OrganizationUserSharingService;
import org.wso2.carbon.identity.organization.management.service.OrganizationManager;
import org.wso2.carbon.identity.role.v2.mgt.core.RoleManagementService;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * Data holder for organization user sharing management.
 */
public class OrganizationUserSharingDataHolder {

    private static final OrganizationUserSharingDataHolder instance = new OrganizationUserSharingDataHolder();
    private RealmService realmService;
    private OrganizationManager organizationManager;
    private RoleManagementService roleManagementService;
    private OrganizationUserSharingService organizationUserSharingService;

    public static OrganizationUserSharingDataHolder getInstance() {

        return instance;
    }

    /**
     * Get the organization manager service.
     *
     * @return Organization manager service.
     */
    public OrganizationManager getOrganizationManager() {

        return organizationManager;
    }

    /**
     * Set the organization manager service.
     *
     * @param organizationManager Organization manager service.
     */
    public void setOrganizationManager(OrganizationManager organizationManager) {

        this.organizationManager = organizationManager;
    }

    /**
     * Get the realm service.
     *
     * @return Realm service.
     */
    public RealmService getRealmService() {

        return realmService;
    }

    /**
     * Set the realm service.
     *
     * @param realmService RealmService service.
     */
    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    /**
     * Get the organization role manager service.
     *
     * @return Organization role manager service.
     */
    public RoleManagementService getRoleManagementService() {

        return roleManagementService;
    }

    /**
     * Set the organization role manager service.
     *
     * @param roleManagementService Organization role manager service.
     */
    public void setRoleManagementService(RoleManagementService roleManagementService) {

        this.roleManagementService = roleManagementService;
    }

    /**
     * Get the organization user sharing service.
     *
     * @return OrganizationUserSharingService organization user sharing service.
     */
    public OrganizationUserSharingService getOrganizationUserSharingService() {

        return organizationUserSharingService;
    }

    /**
     * Set the organization user sharing service.
     *
     * @param organizationUserSharingService Organization user sharing service.
     */
    public void setOrganizationUserSharingService(OrganizationUserSharingService organizationUserSharingService) {

        this.organizationUserSharingService = organizationUserSharingService;
    }
}

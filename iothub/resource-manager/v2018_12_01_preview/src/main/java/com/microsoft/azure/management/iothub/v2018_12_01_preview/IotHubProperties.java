/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview;

import java.util.List;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.implementation.SharedAccessSignatureAuthorizationRuleInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an IoT hub.
 */
public class IotHubProperties {
    /**
     * The shared access policies you can use to secure a connection to the IoT
     * hub.
     */
    @JsonProperty(value = "authorizationPolicies")
    private List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies;

    /**
     * The IP filter rules.
     */
    @JsonProperty(value = "ipFilterRules")
    private List<IpFilterRule> ipFilterRules;

    /**
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The hub state.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * The name of the host.
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostName;

    /**
     * The Event Hub-compatible endpoint properties. The only possible keys to
     * this dictionary is events. This key has to be present in the dictionary
     * while making create or update calls for the IoT hub.
     */
    @JsonProperty(value = "eventHubEndpoints")
    private Map<String, EventHubProperties> eventHubEndpoints;

    /**
     * The routing property.
     */
    @JsonProperty(value = "routing")
    private RoutingProperties routing;

    /**
     * The list of Azure Storage endpoints where you can upload files.
     * Currently you can configure only one Azure Storage account and that MUST
     * have its key as $default. Specifying more than one storage account
     * causes an error to be thrown. Not specifying a value for this property
     * when the enableFileUploadNotifications property is set to True, causes
     * an error to be thrown.
     */
    @JsonProperty(value = "storageEndpoints")
    private Map<String, StorageEndpointProperties> storageEndpoints;

    /**
     * The messaging endpoint properties for the file upload notification
     * queue.
     */
    @JsonProperty(value = "messagingEndpoints")
    private Map<String, MessagingEndpointProperties> messagingEndpoints;

    /**
     * If True, file upload notifications are enabled.
     */
    @JsonProperty(value = "enableFileUploadNotifications")
    private Boolean enableFileUploadNotifications;

    /**
     * The cloudToDevice property.
     */
    @JsonProperty(value = "cloudToDevice")
    private CloudToDeviceProperties cloudToDevice;

    /**
     * IoT hub comments.
     */
    @JsonProperty(value = "comments")
    private String comments;

    /**
     * The device streams properties of iothub.
     */
    @JsonProperty(value = "deviceStreams")
    private IotHubPropertiesDeviceStreams deviceStreams;

    /**
     * The capabilities and features enabled for the IoT hub. Possible values
     * include: 'None', 'DeviceManagement'.
     */
    @JsonProperty(value = "features")
    private Capabilities features;

    /**
     * Get the shared access policies you can use to secure a connection to the IoT hub.
     *
     * @return the authorizationPolicies value
     */
    public List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies() {
        return this.authorizationPolicies;
    }

    /**
     * Set the shared access policies you can use to secure a connection to the IoT hub.
     *
     * @param authorizationPolicies the authorizationPolicies value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withAuthorizationPolicies(List<SharedAccessSignatureAuthorizationRuleInner> authorizationPolicies) {
        this.authorizationPolicies = authorizationPolicies;
        return this;
    }

    /**
     * Get the IP filter rules.
     *
     * @return the ipFilterRules value
     */
    public List<IpFilterRule> ipFilterRules() {
        return this.ipFilterRules;
    }

    /**
     * Set the IP filter rules.
     *
     * @param ipFilterRules the ipFilterRules value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withIpFilterRules(List<IpFilterRule> ipFilterRules) {
        this.ipFilterRules = ipFilterRules;
        return this;
    }

    /**
     * Get the provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hub state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the name of the host.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Get the Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
     *
     * @return the eventHubEndpoints value
     */
    public Map<String, EventHubProperties> eventHubEndpoints() {
        return this.eventHubEndpoints;
    }

    /**
     * Set the Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
     *
     * @param eventHubEndpoints the eventHubEndpoints value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEventHubEndpoints(Map<String, EventHubProperties> eventHubEndpoints) {
        this.eventHubEndpoints = eventHubEndpoints;
        return this;
    }

    /**
     * Get the routing value.
     *
     * @return the routing value
     */
    public RoutingProperties routing() {
        return this.routing;
    }

    /**
     * Set the routing value.
     *
     * @param routing the routing value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withRouting(RoutingProperties routing) {
        this.routing = routing;
        return this;
    }

    /**
     * Get the list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
     *
     * @return the storageEndpoints value
     */
    public Map<String, StorageEndpointProperties> storageEndpoints() {
        return this.storageEndpoints;
    }

    /**
     * Set the list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
     *
     * @param storageEndpoints the storageEndpoints value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withStorageEndpoints(Map<String, StorageEndpointProperties> storageEndpoints) {
        this.storageEndpoints = storageEndpoints;
        return this;
    }

    /**
     * Get the messaging endpoint properties for the file upload notification queue.
     *
     * @return the messagingEndpoints value
     */
    public Map<String, MessagingEndpointProperties> messagingEndpoints() {
        return this.messagingEndpoints;
    }

    /**
     * Set the messaging endpoint properties for the file upload notification queue.
     *
     * @param messagingEndpoints the messagingEndpoints value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withMessagingEndpoints(Map<String, MessagingEndpointProperties> messagingEndpoints) {
        this.messagingEndpoints = messagingEndpoints;
        return this;
    }

    /**
     * Get if True, file upload notifications are enabled.
     *
     * @return the enableFileUploadNotifications value
     */
    public Boolean enableFileUploadNotifications() {
        return this.enableFileUploadNotifications;
    }

    /**
     * Set if True, file upload notifications are enabled.
     *
     * @param enableFileUploadNotifications the enableFileUploadNotifications value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withEnableFileUploadNotifications(Boolean enableFileUploadNotifications) {
        this.enableFileUploadNotifications = enableFileUploadNotifications;
        return this;
    }

    /**
     * Get the cloudToDevice value.
     *
     * @return the cloudToDevice value
     */
    public CloudToDeviceProperties cloudToDevice() {
        return this.cloudToDevice;
    }

    /**
     * Set the cloudToDevice value.
     *
     * @param cloudToDevice the cloudToDevice value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withCloudToDevice(CloudToDeviceProperties cloudToDevice) {
        this.cloudToDevice = cloudToDevice;
        return this;
    }

    /**
     * Get ioT hub comments.
     *
     * @return the comments value
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set ioT hub comments.
     *
     * @param comments the comments value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the device streams properties of iothub.
     *
     * @return the deviceStreams value
     */
    public IotHubPropertiesDeviceStreams deviceStreams() {
        return this.deviceStreams;
    }

    /**
     * Set the device streams properties of iothub.
     *
     * @param deviceStreams the deviceStreams value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withDeviceStreams(IotHubPropertiesDeviceStreams deviceStreams) {
        this.deviceStreams = deviceStreams;
        return this;
    }

    /**
     * Get the capabilities and features enabled for the IoT hub. Possible values include: 'None', 'DeviceManagement'.
     *
     * @return the features value
     */
    public Capabilities features() {
        return this.features;
    }

    /**
     * Set the capabilities and features enabled for the IoT hub. Possible values include: 'None', 'DeviceManagement'.
     *
     * @param features the features value to set
     * @return the IotHubProperties object itself.
     */
    public IotHubProperties withFeatures(Capabilities features) {
        this.features = features;
        return this;
    }

}
package com.data.service.adminService.spotAdminFunctions.spotAdminCompleteSpotInformation;

import com.data.model.SpotAdminCompleteSpotInformationModel;

public interface SpotAdminCompleteSpotInformationService {
	public SpotAdminCompleteSpotInformationModel getSpotInformation(SpotAdminCompleteSpotInformationModel spotAdminCompleteSpotInformationModel);
	public boolean changeSpotInformation(SpotAdminCompleteSpotInformationModel spotAdminCompleteSpotInformationModel);
}

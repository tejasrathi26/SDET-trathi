package smoke_and_sanity_tests.entratamation_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.guests_subtab.GuestsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.smart_devices_tab.SmartDevicesPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.SmartCommunityNav;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.automations_tab.AutomationsPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.music_tab.MusicPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.nightly_reset_tab.NightlyResetPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.occupied_units_tab.OccupiedUnitsPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.overview_tab.OverviewPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.smart_areas_tab.SmartAreasPage;
import page_objects.entrata_page_objects.tools_tab.smart_community_subtab.vacant_units_tab.VacantUnitsPage;

import static org.junit.Assert.assertTrue;

public class ToolsAndResidentsSmartTestsIT extends BaseBrowserTest {

    public ToolsAndResidentsSmartTestsIT() {
        super("testentratamation");
    }

    @Test //TC: 3253053
    public void shouldFindAllSmartCommunityTabPages_whenEachTabIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        SmartCommunityNav smartCommunityNav = new SmartCommunityNav(driver);
        OverviewPage overview = new OverviewPage(driver);
        AutomationsPage autoPage = new AutomationsPage(driver);
        SmartAreasPage smartAreas = new SmartAreasPage(driver);
        VacantUnitsPage vacantUnits = new VacantUnitsPage(driver);
        OccupiedUnitsPage occupiedUnits = new OccupiedUnitsPage(driver);
        NightlyResetPage nightlyReset = new NightlyResetPage(driver);
        AutomationsPage automations = new AutomationsPage(driver);
        MusicPage music = new MusicPage(driver);
        assertTrue("Could not find Tools tab.", navBar.moveToToolsTab());
        assertTrue("Could not click Smart Community sub tab.", navBar.clickSmartCommunitySubTab());
        assertTrue("Could not find Overview page.", overview.overviewPageVisible());
        assertTrue("Could not click Smart Areas tab.", smartCommunityNav.smartAreasTabClick());
        assertTrue("Could not find Smart Areas page.", smartAreas.smartAreasPageVisible());
        assertTrue("Could not click Vacant Units tab.", smartCommunityNav.vacantAreasTabClick());
        assertTrue("Could not find Vacant Units page.", vacantUnits.vacantUnitsPageVisible());
        assertTrue("Could not click Occupied Units tab.", smartCommunityNav.occupiedUnitsTabClick());
        assertTrue("Could not find Occupied Units tab.", occupiedUnits.occupiedUnitsPageVisible());
        assertTrue("Could not click Nightly Reset tab.", smartCommunityNav.nightlyResetTabClick());
        assertTrue("Could not find Nightly Reset page.", nightlyReset.nightlyResetPageVisible());
        assertTrue("Could not click Automations tab.", smartCommunityNav.automationsTabClick());
        assertTrue("Could not find Automations page.", autoPage.automationsPageVisible());
        assertTrue("Could not click Music tab.", smartCommunityNav.musicTabClick());
        assertTrue("Could not find Music page.", music.musicTabPageVisible());
    }

    @Test //TC: 3253190
    public void shouldFindResidentsGuestPage_whenGuestsSubTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        GuestsPage guestsPage = new GuestsPage(driver);
        assertTrue("Could not find Residents page.", navBar.residentsTabHover());
        assertTrue("Could not click Guests sub tab.", navBar.clickGuestsSubTab());
        assertTrue("Could not find Guests page.", guestsPage.guestsPageVisible());
    }

    @Test //TC: 3253212
    public void shouldFindResidentsSmartDevicesPage_whenResidentSmartDevicesTabIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AllResidentsPage allResidentsPage = new AllResidentsPage(driver);
        ResidentProfileCurtainPage residentProfile = new ResidentProfileCurtainPage(driver);
        SmartDevicesPage smartDevicesPage = new SmartDevicesPage(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click resident.", allResidentsPage.clickFirstResidentOnList());
        assertTrue("Could not click Smart Devices tab.", residentProfile.smartDevicesTabClick());
        assertTrue("Could not find Smart Devices page.", smartDevicesPage.smartDevicesPageVisible());
    }
}

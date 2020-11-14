package common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ObjectRepo {

    // Elements
    public static By statusbar;
    public static By tapWifiIos;
    public static By tapWifiIosToggle;
    public static By tapBackIosBtn;
    public static By tapDataIos;
    public static By tapDataIosToggle;
    public static By GeneralSetting;
    public static By deviceManagment;
    public static By developerAccount;
    public static By trust;
    public static By trustBtn;
    public static By deleteBtn;

    //Side Menu
    public static By Name_Sidemenu_Speedchecker;
    public static By Name_Sidemenu_NetworkUsage;
    public static By Name_Sidemenu_Network;
    public static By Button_Need_help;
    public static By Button_Developer_settings;
    public static By Name_Sidemenu_Home;
    public static By Name_Sidemenu_Your_messages;
    public static By Side_menu_inbox_badge;
    public static By Name_Sidemenu_Settings;

    //Speed Checker Landing Page
    public static By Id_landing_back_button;
    public static By Id_Landing_Primary_button;
    public static By Id_Landing_Description_text;
    public static By Id_Landing_Title;
    public static By Id_Landing_Disclaimer;
    public static By Error_screen_text;

    //Developer Settings
    public static By Textarea_Dev_settings_title;
    public static By Textbox_Set_language;
    public static By Dropdown_Change_language;
    public static By Button_Apply;
    public static By Button_language_selection;
    public static By Button_Id_Apply_button;
    public static By Textarea_Name_language_name;
    public static By Button_Name_netperform_settings;
    public static By Network_opt_switch;
    public static By Button_Tailored_switch;
    public static By Id_simswap_field;
    public static By Checkbox_Sim_swap_toggle;
    public static By Button_mock_inbox;

    //Home and T&C
    public static By Vf_logo;
    public static By Button_Menuicon;
    public static By Button_bubble;
    public static By Button_Showbubble;
    public static By Menu_icon_badge;
    public static By Button_Confirm_TC;
    public static By TC_text;
    public static By Usage_Access_Title;
    public static By Usage_Access_Icon;
    public static By Usage_Access_Prim_description;
    public static By Usage_Access_Sec_Description;
    public static By Usage_Access_prim_button;
    public static By Usage_access_sec_button;
    public static By Button_Cancel_TC;

    //BubbleUI
    public static By Button_search;
    public static By Button_close;
    public static By Textarea_Title;
    public static By Image_tabimage;
    public static By Textarea_tabname;
    public static By Image_bubble;
    public static By Button_communitiestab;
    public static By Button_faqstab;
    public static By Textarea_requestcall;

    //Overlay
    public static By id_overlay_header;
    public static By id_overlay_closeButton;
    public static By id_overlay_main_description;
    public static By id_overlay_sub_description;
    public static By id_overlay_negative_btn;
    public static By id_overlay_positive_btn;
    public static By id_overlay_icon;
    public static By Change_in_android_settings;

    //Previous Results
    public static By name_previous_results_network_tab;
    public static By name_previus_results_wifi_tab;
    public static By Name_previous_results_delete_all_btn;
    public static By id_previous_results_date;
    public static By id_previous_results_description;
    public static By id_previous_results_icon;
    public static By id_previous_results_delete_btn;
    public static By id_previous_results_no_tests_text;
    public static By Id_previous_results_arrow;

    //not completed Test
    public static By Id_test_Not_Complete_Overlay;
    public static By Id_test_Not_Complete_Overlay_positive_Button;
    public static By Id_test_Not_Complete_Overlay_negative_Button;

    //Native Permission Page
    public static By Checkbox_Never_ask_again;
    public static By Button_Deny;
    public static By Button_Allow;

    //MultiTask
    public static By Appname;

    //Device Settings
    public static By Checkbox_Location_switch;
    public static By Wifi_toggle;
    public static By Device_permissions_button;
    public static By Usage_Data_Access_appname;
    public static By Button_Usage_Access_Toggle;
    public static By Button_Usage_Access_Toggle_ON;
    public static By Button_Usage_Access_Toggle_OFF;
    public static By Button_Notification_Usage_Access_appname;

    //Test Results
    public static By Id_Test_Result_Title;
    public static By Id_test_result_speed_desc;
    public static By Id_test_result_speed_usage;
    public static By Id_Test_Result_Time;
    public static By Id_Info_Section_Download_view;
    public static By Id_Info_section_download_summary;
    public static By Id_Info_Section_upload_view;
    public static By Id_Info_Section_upload_summary;
    public static By Id_Info_Section_ping_view;
    public static By Id_Info_Section_ping_summary;
    public static By Id_Retest_btn;
    public static By Id_More_about_btn;
    public static By Xpath_download_value;
    public static By xpath_upload_value;
    public static By xpath_ping_value;

    //Running Speed Test
    public static By Id_Gouge;

    //More About Speed Checker
    public static By Name_More_about_title;

    //Inbox
    public static By Your_messages_title;
    public static By Image_Empty_inbox_icon;
    public static By Empty_inbox_description;
    public static By Message_details_webview;
    public static By Show_all_messages_button;
    public static By Delete_message_icon;
    public static By Message_description;
    public static By Message_date;
    public static By Message_icon;

    //Settings
    public static By Settings_Title;
    public static By Button_Privacy;

    //NetworkUsage landing Page
    public static By Button_NetworkUsage_Prim_btn;
    public static By NetworkUsage_wifi_tab;
    public static By NetworkUsage_network_tab;
    public static By NetworkUsage_clear_Button;
    public static By Network_Coverage_Network;
    public static By Internet_Connectivity_Network;
    public static By Call_Made_Network;
    public static By Data_Usage_Network;
    public static By Data_Usage_App_Network;
    public static By Wifi_Usage_WIFI;
    public static By Data_Usage_App_WIFI;

    //Privacy
    public static By Textarea_Access_Data_Usage_label_off;
    public static By Textarea_Access_Data_usage_label_On;
    public static By Textarea_Access_Data_Usage_desc;
    public static By Textarea_Access_Data_Usage_Sub_Desc;
    public static By Checkbox_Tailored_Services_Toggle;
    public static By Textarea_Privacy_Title;
    public static By Textarea_privacy_tailored_services_and_recommendations_title;
    public static By Textarea_privacy_tailored_services_and_recommendations_Desc;
    public static By Textarea_privacy_tailored_services_and_recommendations_collapsed_header;
    public static By Textarea_privacy_tailored_services_and_recommendations_expand_view_title;
    public static By Textarea_privacy_tailored_services_and_recommendations_expand_view_desc;
    public static By Textarea_privacy_tailored_services_and_recommendations_expand_view_sub_desc;
    public static By Checkbox_Network_Optimisation_toggle;
    public static By Textarea_privacy_Network_optimisation_title;
    public static By Textarea_privacy_Network_optimisation_Desc;
    public static By Textarea_privacy_Network_optimisation_collapsed_header;
    public static By Textarea_privacy_Network_optimisation_expand_view_title;
    public static By Textarea_privacy_Network_optimisation_expand_view_desc;
    public static By Button_Tailored_services_and_recommendations_arrow;
    public static By Button_network_optimisation_arrow;
    public static By Tailored_warning_bubble;
    public static By Network_warning_bubble;

    static String build;

    public static void objectRepo(String platform, String build) {
        ObjectRepo.build = build;
        switch (platform) {
            case "native-android": {
                nativeAndroid();
            }
            break;
            case "native-ios": {
                nativeIOS();
            }
            break;
        }

    }

    private static void nativeAndroid() {

        Name_Sidemenu_Speedchecker = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Speed checker\"]");
        Name_Sidemenu_NetworkUsage = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Network usage\"]");
        Name_Sidemenu_Network = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Network\"]");
        Button_Need_help = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Need help?\"]");
        Button_Developer_settings = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Developer settings\"]");
        Name_Sidemenu_Home = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Home\"]");
        Name_Sidemenu_Your_messages = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Your messages\"]");
        Side_menu_inbox_badge = By.id("com.vfg.referenceapp.test:id/iconBadge");
        Name_Sidemenu_Settings = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/title\"and @text=\"Settings\"]");
        Id_landing_back_button = By.id("backArrow");
        Id_Landing_Primary_button = By.id("com.vfg.referenceapp.test:id/dashboardActionButton");
        Id_Landing_Description_text = By.xpath("//android.widget.TextView[contains(@text,\"{@}\")]");
        Id_Landing_Title = By.id("screenTitleTextView");
        Id_Landing_Disclaimer = By.id("dashboardZeroDisclaimerTextView");
        Error_screen_text = By.id("com.vfg.referenceapp.test:id/dashboardActionDescriptionTextView");
        Textarea_Dev_settings_title = By.id("screenTitleTextView");
        Textbox_Set_language = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/titleTextView\"and @text=\"Set country / language\"]");
        Dropdown_Change_language = By.id("languageSpinner");
        Button_Apply = By.id("applyButton");
        Button_language_selection = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/titleTextView\"and @text=\"Set country / language\"]");
        Button_Id_Apply_button = By.id("com.vfg.referenceapp.test:id/applyButton");
        Textarea_Name_language_name = By.name("{@}");
        Button_Name_netperform_settings = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/titleTextView\"and @text=\"Settings screen\"]");
        Network_opt_switch = By.id("com.vfg.referenceapp.test:id/vfg_commonui_imgv_icon");
        Button_Tailored_switch = By.id("com.vfg.referenceapp.test:id/tailored_service_Switch");
        Id_simswap_field = By.id("com.vfg.referenceapp.test:id/mockSettingsSimSwapMsisdnEditText");
        Checkbox_Sim_swap_toggle = By.id("com.vfg.referenceapp.test:id/mockSettingsSimSwapSwitch");
        Button_mock_inbox = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
        Button_Menuicon = By.id("com.vfg.referenceapp.test:id/menuIcon");
        Button_bubble = By.id("com.vfg.referenceapp.test:id/needHelp_button");
        Button_Showbubble = By.id("com.vfg.referenceapp.test:id/lottieAnimationView");
        Menu_icon_badge = By.id("com.vfg.referenceapp.test:id/menuIconBadge");
        Button_Confirm_TC = By.id("com.vfg.referenceapp.test:id/confirm_button");
        TC_text = By.id("com.vfg.referenceapp.test:id/permissionTitle");
        Usage_Access_Title = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/usageAccessPageTitle\"and @text=\"{@}\"]");
        Usage_Access_Icon = By.id("usageAccessIconImageView");
        Usage_Access_Prim_description = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/usageAccessPermissionDescription\"and contains (@text,\"{@}\")]");
        Usage_Access_Sec_Description = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/usageAccessPermissionSubDescription\"and contains(@text,\"{@}\")]");
//        Usage_Access_prim_button = By.id("changeInSettingsButton");
        Usage_Access_prim_button = By.id("com.vfg.referenceapp.test:id/changeInSettingsButton");
        Usage_access_sec_button = By.id("com.vfg.referenceapp.test:id/noThanksButton");
        Button_Cancel_TC = By.id("com.vfg.referenceapp.test:id/cancel_button");
        Button_search = By.id("com.vfg.referenceapp.test:id/search_image_view");
        Button_close = By.id("com.vfg.referenceapp.test:id/close_image_view");
        Textarea_Title = By.id("com.vfg.referenceapp.test:id/title_text_view");
        Image_tabimage = By.id("com.vfg.referenceapp.test:id/tab_image_view");
        Textarea_tabname = By.id("com.vfg.referenceapp.test:id/tab_title_text_view");
        Image_bubble = By.id("com.vfg.referenceapp.test:id/needHelp_button");
        Button_communitiestab = By.name("Communities");
        Button_faqstab = By.id("com.vfg.referenceapp.test:id/tab_title_text_view");
        Textarea_requestcall = By.name("Request a call");
        id_overlay_header = By.id("com.vfg.referenceapp.test:id/titleTextView");
        id_overlay_closeButton = By.id("com.vfg.referenceapp.test:id/cancelButton");
        id_overlay_main_description = By.id("com.vfg.referenceapp.test:id/introductionTextView");
        id_overlay_sub_description = By.id("com.vfg.referenceapp.test:id/bodyTextView");
        id_overlay_negative_btn = By.id("com.vfg.referenceapp.test:id/secondaryButton");
        id_overlay_positive_btn = By.id("com.vfg.referenceapp.test:id/primaryButton");
        id_overlay_icon = By.id("iconImageView");
        Change_in_android_settings = By.id("com.vfg.referenceapp.test:id/primaryButton");
        name_previous_results_network_tab = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"and @text=\"Network\"]");
        name_previus_results_wifi_tab = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"and @text=\"Wi-Fi\"]");
        Name_previous_results_delete_all_btn = By.id("com.vfg.referenceapp.test:id/delete_prev_results_btn");
        id_previous_results_date = By.id("previousTestItemDateTextView");
        id_previous_results_description = By.id("previousTestItemSpeedSummaryTextView");
        id_previous_results_icon = By.xpath("//*[following-sibling::*[child::*[@resource-id=\"com.vfg.referenceapp.test:id/previousTestItemDateTextView\"]]]");
        id_previous_results_delete_btn = By.id("delete_linear_layout");
        id_previous_results_no_tests_text = By.id("contentRecyclerErrorMessageTextView");
        Id_previous_results_arrow = By.id("com.vfg.referenceapp.test:id/delete_linear_layout");
        Checkbox_Never_ask_again = By.id("com.android.packageinstaller:id/do_not_ask_checkbox");
        Button_Deny = By.id("com.android.packageinstaller:id/permission_deny_button");
        Button_Allow = By.id("com.android.packageinstaller:id/permission_allow_button");
        Appname = By.xpath("//android.widget.TextView[@resource-id=\"com.android.systemui:id/title\"and @text=\"{@}\"]");
        Checkbox_Location_switch = By.id("com.android.settings:id/switch_widget");
        Wifi_toggle = By.id("com.android.settings:id/switch_widget");
        Device_permissions_button = By.name("Permissions");
        Usage_Data_Access_appname = By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\"and @text=\"My Vodafone Reference App\"]");
        Button_Usage_Access_Toggle = By.id("android:id/switch_widget");
        Button_Usage_Access_Toggle_ON = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"and @text=\"ON\"]");
        Button_Usage_Access_Toggle_OFF = By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"and @text=\"OFF\"]");
        Button_Notification_Usage_Access_appname = By.xpath("//android.widget.TextView[@resource-id=\"android:id/app_name_text\"and @text=\"{@}\"]");
        Id_Test_Result_Title = By.id("screenTitleTextView");
        Id_test_result_speed_desc = By.id("com.vfg.referenceapp.test:id/resultsCardSpeedIsTextView");
        Id_test_result_speed_usage = By.id("com.vfg.referenceapp.test:id/resultsCardSpeedUsabilityTextView");
        Id_Test_Result_Time = By.id("com.vfg.referenceapp.test:id/resultsTestTimeTextView");
        Id_Info_Section_Download_view = By.id("download_speed_text_view");
        Id_Info_section_download_summary = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/download_speed_summary_text_view\"]");
        Id_Info_Section_upload_view = By.id("upload_speed_text_view");
        Id_Info_Section_upload_summary = By.id("upload_speed_summary_text_view");
        Id_Info_Section_ping_view = By.id("ping_text_view");
        Id_Info_Section_ping_summary = By.id("ping_summary_text_view");
        Id_Retest_btn = By.id("testResultsRetestButton");
        Id_More_about_btn = By.id("testResultsMoreAboutButton");
        Xpath_download_value = By.xpath("(//android.widget.TextView[@resource-id='com.vfg.referenceapp.test:id/textualTestValueTextView'])[1]");
        xpath_upload_value = By.xpath("(//android.widget.TextView[@resource-id='com.vfg.referenceapp.test:id/textualTestValueTextView'])[2]");
        xpath_ping_value = By.xpath("(//android.widget.TextView[@resource-id='com.vfg.referenceapp.test:id/textualTestValueTextView'])[3]");
        Id_Gouge = By.id("circleInfoContainerLayout");
        Name_More_about_title = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/screenTitleTextView\"and @text=\"More about Speed checker\"]");
        Your_messages_title = By.xpath("//android.widget.TextView[contains(@text,\"{@}\")]");
        Image_Empty_inbox_icon = By.id("com.vfg.referenceapp.test:id/emptyInboxIcon");
        Empty_inbox_description = By.id("com.vfg.referenceapp.test:id/noMessagesTextView");
        Message_details_webview = By.id("com.vfg.referenceapp.test:id/webView");
        Show_all_messages_button = By.id("com.vfg.referenceapp.test:id/showAllMessagesButton");
        Delete_message_icon = By.id("com.vfg.referenceapp.test:id/swipeDeleteAction");
        Message_description = By.id("com.vfg.referenceapp.test:id/inboxListItemTitleTextView");
        Message_date = By.id("com.vfg.referenceapp.test:id/inboxListItemDateTextView");
        Message_icon = By.id("com.vfg.referenceapp.test:id/inboxListItemIconImageView");
        Settings_Title = By.id("com.vfg.referenceapp.test:id/settings_page_title");
        Button_Privacy = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and @text=\"Privacy\"]");
        Button_NetworkUsage_Prim_btn = By.id("com.vfg.referenceapp.test:id/learnMoreActionButton");
        NetworkUsage_wifi_tab = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"and @text=\"Wi-Fi\"]");
        NetworkUsage_network_tab = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"and @text=\"Network\"]");
        NetworkUsage_clear_Button = By.id("com.vfg.referenceapp.test:id/networkUsageClearButton");
        Network_Coverage_Network = By.id("com.vfg.referenceapp.test:id/network_coverage_percentageTextView");
        Internet_Connectivity_Network = By.id("com.vfg.referenceapp.test:id/internet_connectivity_percentageTextView");
        Call_Made_Network = By.id("com.vfg.referenceapp.test:id/monthly_chart_description_text_view");
        Data_Usage_Network = By.id("com.vfg.referenceapp.test:id/monthly_chart_description_text_view");
        Data_Usage_App_Network = By.id("com.vfg.referenceapp.test:id/contentRecyclerErrorMessageTextView");
        Wifi_Usage_WIFI = By.id("com.vfg.referenceapp.test:id/monthly_chart_description_text_view");
        Data_Usage_App_WIFI = By.xpath("//*[child::*[@resource-id=\"com.vfg.referenceapp.test:id/top_ten_disclaimer_text_view\"]]");
        Textarea_Access_Data_Usage_label_off = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and @text=\"{@}\"]");
        Textarea_Access_Data_usage_label_On = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and contains(@text,\"{@}\")]");
        Textarea_Access_Data_Usage_desc = By.id("com.vfg.referenceapp.test:id/usage_access_description");
        Textarea_Access_Data_Usage_Sub_Desc = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/usage_access_sub_description\"and @text=\"{@}\"]");
        Checkbox_Tailored_Services_Toggle = By.xpath("//*[child::*[child::*[@text=\"Tailored service and recommendations\"]]]/*[2]");
        Textarea_Privacy_Title = By.id("privacy_options_page_title");
        Textarea_privacy_tailored_services_and_recommendations_title = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and @text=\"{@}\"]");
        Textarea_privacy_tailored_services_and_recommendations_Desc = By.id("com.vfg.referenceapp.test:id/personalized_description");
        Textarea_privacy_tailored_services_and_recommendations_collapsed_header = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and @text=\"{@}\"]");
        Textarea_privacy_tailored_services_and_recommendations_expand_view_title = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/tv_paragraph\"and @text=\"{@}\"]");
        Textarea_privacy_tailored_services_and_recommendations_expand_view_desc = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/tv_bullets\"and @text=\"{@}\"]");
        Textarea_privacy_tailored_services_and_recommendations_expand_view_sub_desc = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/tv_paragraph\"and @text=\"{@}\"]");
        Checkbox_Network_Optimisation_toggle = By.xpath("//*[child::*[child::*[@text=\"Network optimisation\"]]]/*[2]");
        Textarea_privacy_Network_optimisation_title = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and @text=\"{@}\"]");
        Textarea_privacy_Network_optimisation_Desc = By.id("com.vfg.referenceapp.test:id/anonymous_description");
        Textarea_privacy_Network_optimisation_collapsed_header = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/vfg_commonui_title\"and @text=\"{@}\"]");
        Textarea_privacy_Network_optimisation_expand_view_title = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/tv_paragraph\"and @text=\"{@}\"]");
        Textarea_privacy_Network_optimisation_expand_view_desc = By.xpath("//android.widget.TextView[@resource-id=\"com.vfg.referenceapp.test:id/tv_bullets\"and @text=\"{@}\"]");
        Button_Tailored_services_and_recommendations_arrow = By.xpath("(//android.widget.TextView[@text={@}]/../following-sibling::android.widget.ImageView) [1]");
        Button_network_optimisation_arrow = By.xpath("(//android.widget.TextView[@text={@}]/../following-sibling::android.widget.ImageView) [2]");
        Tailored_warning_bubble = By.id("com.vfg.referenceapp.test:id/warning_cell_textView");
        Network_warning_bubble = By.id("com.vfg.referenceapp.test:id/warning_cell_textView");

        Id_test_Not_Complete_Overlay = By.id("com.vfg.referenceapp.test:id/mainOverlayContainer");
        Id_test_Not_Complete_Overlay_positive_Button = By.id("com.vfg.referenceapp.test:id/primaryButton");
        Id_test_Not_Complete_Overlay_negative_Button = By.id("com.vfg.referenceapp.test:id/secondaryButton");
    }

    private static void nativeIOS() {
        statusbar = By.xpath("//XCUIElementTypeStatusBar");

        //side menu(-1)
        Name_Sidemenu_Network = By.xpath("//XCUIElementTypeOther[@name=\"Network\"]");
        Name_Sidemenu_Speedchecker = By.id("Speed checker");
        Button_Need_help = By.xpath("//XCUIElementTypeOther[@name=\"Need help?\"]");
        Button_Developer_settings = By.xpath("//XCUIElementTypeOther[@name=\"Developer settings\"]");
        Name_Sidemenu_Home = By.id("");
        Name_Sidemenu_Your_messages = By.id("Your messages");
        Side_menu_inbox_badge = By.xpath("(//XCUIElementTypeStaticText[@name=\"62\"])[2]");
        Name_Sidemenu_Settings = By.xpath("//XCUIElementTypeOther[@name=\"Settings\"]");

        //Speed Checker Landing Page(-1)
        Id_landing_back_button = By.id("arrowLeft01");
        Id_Landing_Primary_button = By.id("Start test");
        Id_Landing_Description_text = By.xpath("//XCUIElementTypeStaticText[@name=\"Check your network or Wi-Fi speed now\"]");
        Id_Landing_Title = By.xpath("(//XCUIElementTypeStaticText[@name=\"Speed checker\"])[2]");
        Id_Landing_Disclaimer = By.xpath("//XCUIElementTypeStaticText[@name=\"*Speed tests are free on your home network\"]");
        Error_screen_text = By.id("");

        //Developer Settings >>>>>> (difference in ios ans AND)
        Textarea_Dev_settings_title = By.id("Developer Settings");
        Textbox_Set_language = By.id("Set country/language");
        Dropdown_Change_language = By.id("");
        Button_Apply = By.id("");
        Button_language_selection = By.id("");
        Button_Id_Apply_button = By.id("");
        Textarea_Name_language_name = By.id("");
        Button_Name_netperform_settings = By.id("");
        Network_opt_switch = By.id("");
        Button_Tailored_switch = By.id("");
        Id_simswap_field = By.id("");
        Checkbox_Sim_swap_toggle = By.id("");
        Button_mock_inbox = By.id("");

        //Home >>> without usage access ids
        Vf_logo = By.id("logoFlat");
        Button_Menuicon = By.id("menu01");
        Button_bubble = By.id("bubble");// the bubble of the need help
        Button_Showbubble = By.id("");
        Menu_icon_badge = By.id("");
        Button_Confirm_TC = By.id("");
        TC_text = By.id("");

        //BubbleUI >>>> don't know it
        Button_search = By.id("");

        //Previous Results (Done)
        name_previous_results_network_tab = By.xpath("//XCUIElementTypeButton[@name=\"Network\"]");
        name_previus_results_wifi_tab = By.id("Wi-Fi");
        Name_previous_results_delete_all_btn = By.xpath("//XCUIElementTypeButton[@name=\"Delete previous speed tests\"]");
        id_previous_results_date = By.xpath("//XCUIElementTypeStaticText[@name=\"previousTestItemDateTextView\"]");
        id_previous_results_description = By.xpath("//XCUIElementTypeStaticText[@name=\"previousTestItemSpeedSummaryTextView\"]");
        id_previous_results_delete_btn = By.xpath("//child::*[XCUIElementTypeStaticText[@name=\"previousTestItemDateTextView\"]]/*[2]");
        id_previous_results_no_tests_text = By.xpath("//XCUIElementTypeTable[@name=\"Empty list\"]/following::*[2]");
        Id_previous_results_arrow = By.xpath("//XCUIElementTypeImage[@name=\"chevronRight\"]");

        //Native Permission Page
        Checkbox_Never_ask_again = By.id("");
        Button_Deny = By.id("");
        Button_Allow = By.id("");

        //MultiTask
        Appname = By.id("");

        //Device Settings

        // >>>> need to be checked for ios

        //Test Results  (Done)
        Id_Test_Result_Title = By.id("Speed test results");
        Id_test_result_speed_desc = By.id("Your speed is great for");
        Id_test_result_speed_usage = By.id("resultsCardSpeedUsabilityTextView");
        Id_Test_Result_Time = By.id("resultsTestTimeTextView");
        Id_Info_Section_Download_view = By.id("download_speed_text_view");
        Id_Info_section_download_summary = By.id("download_speed_summary_text_view");
        Id_Info_Section_upload_view = By.id("upload_speed_text_view");
        Id_Info_Section_upload_summary = By.id("upload_speed_summary_text_view");
        Id_Info_Section_ping_view = By.id("ping_text_view");
        Id_Info_Section_ping_summary = By.id("ping_summary_text_view");
        Id_Retest_btn = By.id("Retest");
        Id_More_about_btn = By.id("More about Speed checker");
        Xpath_download_value = By.xpath("//XCUIElementTypeStaticText[@name=\"textualTestValueTextView1\"]");
        xpath_upload_value = By.xpath("//XCUIElementTypeStaticText[@name=\"textualTestValueTextView3\"]");
        xpath_ping_value = By.xpath("//XCUIElementTypeStaticText[@name=\"textualTestValueTextView2\"]");

        //Running Speed Test
        Id_Gouge = By.id("");

        //More About Speed Checker
        Name_More_about_title = By.id("More about Speed checker");

        //Inbox
        Your_messages_title = By.id("My messages");
        Image_Empty_inbox_icon = By.id("");
        Empty_inbox_description = By.id("");
        Message_details_webview = By.id("");
        Show_all_messages_button = By.id("Show all messages");
        Delete_message_icon = By.id("");//????
        Message_description = By.id("");//Dynamic
        Message_date = By.id("");//Dynamic
        Message_icon = By.id("");//Dynamic

        //Settings
        Settings_Title = By.id("(//XCUIElementTypeStaticText[@name=\"Settings\"])[2]");
        Button_Privacy = By.xpath("//XCUIElementTypeStaticText[@name=\"Privacy\"]");//re check this again

        //Privacy
        Checkbox_Tailored_Services_Toggle = By.xpath("//XCUIElementTypeSwitch[@name=\"Tailored service and recommendations\"]");
        Textarea_Privacy_Title = By.id("Privacy");
        Textarea_privacy_tailored_services_and_recommendations_title = By.xpath("//XCUIElementTypeStaticText[@name=\"Tailored service and recommendations\"]");
        Textarea_privacy_tailored_services_and_recommendations_Desc = By.xpath("//XCUIElementTypeSwitch[@name=\"Tailored service and recommendations\"]/following::*[4]");
        Textarea_privacy_tailored_services_and_recommendations_collapsed_header = By.xpath("(//XCUIElementTypeStaticText[@name=\"What happens when you keep this on?\"])[1]");
        Textarea_privacy_tailored_services_and_recommendations_expand_view_title = By.xpath("");
        Textarea_privacy_tailored_services_and_recommendations_expand_view_desc = By.xpath("");
        Textarea_privacy_tailored_services_and_recommendations_expand_view_sub_desc = By.xpath("");
        Checkbox_Network_Optimisation_toggle = By.xpath("//XCUIElementTypeSwitch[@name=\"Network optimisation\"]");
        Textarea_privacy_Network_optimisation_title = By.xpath("//XCUIElementTypeStaticText[@name=\"Network optimisation\"]");
        Textarea_privacy_Network_optimisation_Desc = By.xpath("//XCUIElementTypeSwitch[@name=\"Network optimisation\"]/following::*[4]");
        Textarea_privacy_Network_optimisation_collapsed_header = By.xpath("(//XCUIElementTypeStaticText[@name=\"What happens when you keep this on?\"])[2]");
        Textarea_privacy_Network_optimisation_expand_view_title = By.xpath("");
        Textarea_privacy_Network_optimisation_expand_view_desc = By.xpath("");
        Button_Tailored_services_and_recommendations_arrow = By.xpath("");
        Button_network_optimisation_arrow = By.xpath("");
        Tailored_warning_bubble = By.xpath("//XCUIElementTypeOther[@name=\"You need this option switched ON to be able to check your network speed\"]");
    }
}
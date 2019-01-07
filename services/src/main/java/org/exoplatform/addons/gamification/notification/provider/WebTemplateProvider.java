package org.exoplatform.addons.gamification.notification.provider;

import org.exoplatform.addons.gamification.GamificationConstant;
import org.exoplatform.addons.gamification.notification.builder.GamificationTemplateBuilder;
import org.exoplatform.commons.api.notification.annotation.TemplateConfig;
import org.exoplatform.commons.api.notification.annotation.TemplateConfigs;
import org.exoplatform.commons.api.notification.channel.template.TemplateProvider;
import org.exoplatform.commons.api.notification.model.PluginKey;
import org.exoplatform.container.xml.InitParams;

@TemplateConfigs(templates = {
        @TemplateConfig(pluginId = GamificationConstant.GAMIFICATION_EARNED_BADGE_NOTIFICATION_ID, template = "war:/conf/gamication/templates/notification/web/GamificationEarnedBadgeWebPlugin.gtmpl")})
public class WebTemplateProvider extends TemplateProvider {
    public WebTemplateProvider(InitParams initParams) {
        super(initParams);
        this.templateBuilders.put(PluginKey.key(GamificationConstant.GAMIFICATION_EARNED_BADGE_NOTIFICATION_ID), new GamificationTemplateBuilder(this, false));
    }
}

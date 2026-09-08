package com.buzbuz.smartautoclicker.feature.smart.config.ui.condition.screen.selection

import com.buzbuz.smartautoclicker.core.common.overlays.dialog.implementation.DialogChoice
import com.buzbuz.smartautoclicker.feature.smart.config.R

sealed class ImageSourceChoice (
    title: Int,
    description: Int,
    iconId: Int?,
): DialogChoice(
    title = title,
    description = description,
    iconId = iconId,
) {
    data object OnTakeFromScreen : ImageSourceChoice(
        R.string.item_image_condition_source_screen_title,
        R.string.item_image_condition_source_screen_desc,
        R.drawable.ic_image_condition,
    )
    data object OnImportImage : ImageSourceChoice(
        R.string.item_image_condition_source_import_title,
        R.string.item_image_condition_source_import_desc,
        R.drawable.ic_image_condition,
    )

}

fun allImageSourceChoices() = listOf(
    ImageSourceChoice.OnTakeFromScreen,
    ImageSourceChoice.OnImportImage,
)
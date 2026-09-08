package com.buzbuz.smartautoclicker.feature.smart.config.ui.condition.screen.selection

import com.buzbuz.smartautoclicker.core.common.overlays.dialog.implementation.MultiChoiceDialog
import com.buzbuz.smartautoclicker.feature.smart.config.R

class ImageSourceSelectionDialog(
    choices: List<ImageSourceChoice>,
    onChoiceSelectedListener: (ImageSourceChoice) -> Unit,
    onCancelledListener: (() -> Unit)? = null,
) : MultiChoiceDialog<ImageSourceChoice>(
    theme = R.style.AppTheme,
    dialogTitleText = R.string.dialog_title_image_condition_source,
    choices = choices,
    onChoiceSelected = onChoiceSelectedListener,
    onCanceled = onCancelledListener,
)
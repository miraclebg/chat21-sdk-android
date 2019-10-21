package org.chat21.android.core.messages.listeners;

import org.chat21.android.core.exception.ChatRuntimeException;
import org.chat21.android.core.messages.models.Message;

/**
 * Created by andrealeo on 06/12/17.
 */

public interface ConversationMessagesListener {

    void onConversationMessageReceived(Message message, boolean ischatNotFound, ChatRuntimeException e);

    void onConversationMessageChanged(Message message, ChatRuntimeException e);

    void onConversationMessageDeleted(Message message, ChatRuntimeException e);

    void onConversationCountRecieved(long count);

}


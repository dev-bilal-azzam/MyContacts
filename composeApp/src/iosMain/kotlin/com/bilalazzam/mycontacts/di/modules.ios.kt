@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.bilalazzam.mycontacts.di

import com.bilalazzam.kontacts.ContactsProvider
import com.bilalazzam.kontacts.ContactsProviderFactory

actual class Dependencies {
    actual val contactsProvider: ContactsProvider = ContactsProviderFactory().createContactsProvider()
}
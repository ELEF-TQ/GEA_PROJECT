import { Icon } from '@iconify/react';

import { SideNavItem } from './types';

export const SIDENAV_ITEMS: SideNavItem[] = [
  {
    title: 'Home',
    path: '/dashboard',
    icon: <Icon icon="lucide:home" width="24" height="24" />,
  },
  {
    title: 'Messages',
    path: '/dashboard/messages',
    icon: <Icon icon="lucide:mail" width="24" height="24" />,
  },
  {
    title: 'Settings',
    path: '/dashboard/settings',
    icon: <Icon icon="lucide:settings" width="24" height="24" />,
    submenu: true,
    subMenuItems: [
      { title: 'Account', path: '/dashboard/settings/account' },
      { title: 'Privacy', path: '/dashboard/settings/privacy' },
    ],
  },
  {
    title: 'Help',
    path: '/dashboard/help',
    icon: <Icon icon="lucide:help-circle" width="24" height="24" />,
  },
];
